package com.blendingbeauty.dao;

import com.blendingbeauty.dto.SearchEntry;

import java.util.List;

/**
 * Created by moku on 9/17/16.
 */
public interface ISearchDAO {

    public List<SearchEntry> fetchKeywords();

    public void insert(SearchEntry searchEntry) throws Exception;

    public void update(SearchEntry searchEntry) throws  Exception;

    public void delete(SearchEntry searchEntry) throws  Exception;
}
