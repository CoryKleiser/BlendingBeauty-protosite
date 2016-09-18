package com.blendingbeauty.service.test;

import com.blendingbeauty.dao.ISearchDAO;
import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.service.SearchService;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by moku on 9/17/16.
 */
public class TestSearchService extends TestCase {

    private SearchService searchService;
    private List<SearchEntry> filteredKeywords;
    private ISearchDAO searchDAO;

    @Test
    public void testFilterKeywords(){

        givenThatSearchServiceIsPopulatedWithSearchDAO();
        whenFilterWithRed();
        thenVerifyTwoResults();

    }

    public void givenThatSearchServiceIsPopulatedWithSearchDAO() {
        //TODO:: generate test code
        searchService = new SearchService();

        // a set of keywords pulled from content on website
        searchDAO = mock(ISearchDAO.class);
        // get keywords
        List<SearchEntry> allKeywords = constructSearchList();
        // tell the mock object to return our set of keywords, when requested
        when(searchDAO.fetchKeywords()).thenReturn(allKeywords);
        // associate the mock object with the object we are testing
        searchService.setSearchDAO(searchDAO);


    }

    public List<SearchEntry> constructSearchList(){
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

        return keywords;
    }

    public void whenFilterWithRed() {
        //TODO:: generate test code
        filteredKeywords = searchService.filterKeywords("eye");

        verify(searchDAO, times(1)).fetchKeywords();

    }

    public void thenVerifyTwoResults() {
        //TODO:: generate test code
        assertEquals(3, filteredKeywords.size());

    }


}
