package com.blendingbeauty.service;

import com.blendingbeauty.dto.SearchEntry;

import java.util.List;

/**
 * ISearchService contains business logic for site searches
 * @author Cory Kleiser
 */
public interface ISearchService {

    /**
     * Return on collection of SearchEntry Objects that contain filtered text
     * @param filter a substring that should be contained in returned text
     * @return a collection of search terms containing filtered text
     */
    List<SearchEntry> filterKeywords(String filter);


    /**
     * Saves Keyword to server for future client queries
     * @param searchEntry the keyword we are persisting
     * @throws Exception unable to save
     */
    void saveKeyword(SearchEntry searchEntry) throws Exception;
}
