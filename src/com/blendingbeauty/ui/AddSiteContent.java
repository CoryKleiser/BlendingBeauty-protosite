package com.blendingbeauty.ui;

import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.service.ISearchService;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ManagedBean
@Scope("session")
public class AddSiteContent {

    public SearchEntry getSearchEntry() {
        return searchEntry;
    }

    public void setSearchEntry(SearchEntry searchEntry) {
        this.searchEntry = searchEntry;
    }

    @Inject
    private SearchEntry searchEntry;

    public ISearchService getSearchService() {
        return searchService;
    }

    public void setSearchService(ISearchService searchService) {
        this.searchService = searchService;
    }

    @Inject
    private ISearchService searchService;

    public String execute(){
        String returnValue = "success";
        try {
            searchService.saveKeyword(searchEntry);
        } catch (Exception e) {
            e.printStackTrace();
            returnValue = "fail";
        }
        return returnValue;
    }

}
