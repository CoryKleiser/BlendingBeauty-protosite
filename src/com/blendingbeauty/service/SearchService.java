package com.blendingbeauty.service;

import com.blendingbeauty.dao.ISearchDAO;
import com.blendingbeauty.dto.SearchEntry;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cory Kleiser
 */
@Named
public class SearchService implements ISearchService{

    public ISearchDAO getSearchDAO() {
        return searchDAO;
    }

    public void setSearchDAO(ISearchDAO searchDAO) {
        this.searchDAO = searchDAO;
    }

    @Inject
    private ISearchDAO searchDAO;
    private List<SearchEntry> allKeywords;

    @Override
    public List<SearchEntry> filterKeywords(String filter) {
        if (allKeywords == null) {
            allKeywords = getSearchDAO().fetchKeywords();
        }

        // the collection to be returned
        List<SearchEntry> returnKeywords = new ArrayList<SearchEntry>();

        //TODO:: filter collection
        // interview all possible keywords(allKeywords) and move matching keywords to subset(returnKeywords)
        for (SearchEntry searchEntry : allKeywords){
            if (searchEntry.toString().contains(filter)){
                // add plants matching the criteria
                returnKeywords.add(searchEntry);
            }
        }

        //return
        return returnKeywords;
    }
}
