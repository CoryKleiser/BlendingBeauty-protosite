package com.blendingbeauty.ui;

import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.service.ISearchService;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named
@ManagedBean
@Scope("session")
public class SiteSearch {

    @Inject
    private SearchEntry searchEntry;

    @Inject
    private ISearchService searchService;

    public String execute(){
        if(searchEntry != null && !searchEntry.getValue().equalsIgnoreCase("no results")){
            return "results";
        }
        else{
            return "noResults";
        }
    }

    public void setEntry(SearchEntry searchEntry){
        this.searchEntry = searchEntry;
    }

    public List<SearchEntry> completeEntry(String query){
        return searchService.filterKeywords(query);
    }

}
