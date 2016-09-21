package com.blendingbeauty.ui.test;

import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.ui.SiteSearch;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by moku on 9/18/16.
 */
public class TestSearchEntry extends TestCase {


    private SiteSearch siteSearch;
    private SearchEntry searchEntry;
    private String execute;


    @Test
    public void testSearchEntryExecute(){
        giveSearchEntryCreatedWithKeywords();
        whenInvokeExecute();
        thenVerifyReturnSuccess();
    }

    @Test
    public void testSearchEntryNoResults(){
        givenSearchEntryWithNoResults();
        whenInvokeExecute();
        thenVerifyReturnNoResults();
    }

    @Test
    public void testSiteSearchNull(){
        givenSiteSearchCreatedWithNullKeywords();
        whenInvokeExecute();
        thenVerifyReturnNoResults();
    }

    private void giveSearchEntryCreatedWithKeywords() {
        siteSearch = new SiteSearch();
        searchEntry = new SearchEntry();
        searchEntry.setValue("eye");
        siteSearch.setEntry(searchEntry);
    }

    private void givenSearchEntryWithNoResults() {
        siteSearch = new SiteSearch();
        searchEntry = new SearchEntry();
        searchEntry.setValue("no results");
        siteSearch.setEntry(searchEntry);
    }

    private void givenSiteSearchCreatedWithNullKeywords() {
        siteSearch = new SiteSearch();
    }

    private void whenInvokeExecute() {
        execute = siteSearch.execute();
    }

    private void thenVerifyReturnSuccess() {
        assertEquals("results", execute);
    }

    private void thenVerifyReturnNoResults() {
        assertEquals("noResults", execute);
    }
}
