package com.blendingbeauty.dao;

import com.blendingbeauty.dto.SearchEntry;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("searchDAO")
public class SearchDAOStub implements ISearchDAO {

    @Override
    public List<SearchEntry> fetchKeywords() {
        List keywords = new ArrayList<SearchEntry>();

        SearchEntry lipstick = new SearchEntry();
        lipstick.setValue("lipstick");
        keywords.add(lipstick);

        SearchEntry blush = new SearchEntry();
        blush.setValue("blush");
        keywords.add(blush);

        SearchEntry eyeshadow = new SearchEntry();
        eyeshadow.setValue("eyeshadow");
        keywords.add(eyeshadow);

        SearchEntry contour = new SearchEntry();
        contour.setValue("contour");
        keywords.add(contour);

        SearchEntry eyeliner = new SearchEntry();
        eyeliner.setValue("eyeliner");
        keywords.add(eyeliner);

        SearchEntry eyelashes = new SearchEntry();
        eyelashes.setValue("eyelashes");
        keywords.add(eyelashes);

        SearchEntry cutCrease = new SearchEntry();
        cutCrease.setValue("cut crease");
        keywords.add(cutCrease);

        SearchEntry foundation = new SearchEntry();
        foundation.setValue("foundation");
        keywords.add(foundation);


        return keywords;

    }

    @Override
    public void insert(SearchEntry searchEntry) throws Exception {

    }

    @Override
    public void update(SearchEntry searchEntry) throws Exception {

    }

    @Override
    public void delete(SearchEntry searchEntry) throws Exception {

    }
}
