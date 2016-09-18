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
    public List<SearchEntry> filterKeywords(String filter);


}
