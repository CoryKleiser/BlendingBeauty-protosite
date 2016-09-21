package com.blendingbeauty.ui;

import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.service.ISearchService;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
        //get faces context

        FacesContext currentInstance = FacesContext.getCurrentInstance();

        try {
            //add keyword
            searchService.saveKeyword(searchEntry);
            //what is the message we want to show
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", "Entry Saved");
            //display message
            currentInstance.addMessage(null, fm);
        } catch (Exception e) {
            e.printStackTrace();
            returnValue = "fail";
            //what is the message we want to show
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Whoops!", "Entry Is Unable To Be Saved");
            //display message
            currentInstance.addMessage(null, fm);
        }
        return returnValue;
    }

}
