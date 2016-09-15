package com.blendingbeauty.ui;

import com.blendingbeauty.dto.SearchEntry;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ManagedBean
@Scope("session")
public class SiteSearch {

    @Inject
    private SearchEntry searchEntry;

    public String execute(){
        if(searchEntry != null && !searchEntry.getValue().equalsIgnoreCase("fuck")){
            return "results";
        }
        else{
            return "noResults";
        }
    }
}
