package com.blendingbeauty.ui.test;

import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.ui.SiteSearch;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by moku on 9/18/16.
 */
public class TestSearchEntry extends TestCase {


    private SearchEntry searchEntry;
    private SiteSearch siteSearch;
    private String execute;

    @Test
    public void testSearchEntryNoResults(){
        givenSearchEntryWithNoResults();
        whenInvokeExecute();
        thenVerifyReturnNoResults();
    }

    private void thenVerifyReturnNoResults() {
        assertEquals("no results", execute);
    }

    private void givenSearchEntryWithNoResults() {
        siteSearch = new SiteSearch();
        searchEntry = new SearchEntry();
        searchEntry.setValue("xxxxx");
        siteSearch.completeEntry(searchEntry);
    }

    @Test
    public void testSearchEntryExecute(){
        giveSearchEntryCreatedWithKeywords();
        whenInvokeExecute();
        thenVerifyReturnSuccess();
    }

    private void thenVerifyReturnSuccess() {
        assertEquals("success", execute);
    }

    private void whenInvokeExecute() {
        execute = siteSearch.execute();
    }

    private void giveSearchEntryCreatedWithKeywords() {
        siteSearch = new SiteSearch();
        searchEntry = new SearchEntry();
        searchEntry.setValue("eye");
        siteSearch.completeEntry(searchEntry);
    }

    @Test
    public void testSiteSearchNull(){
        givenSiteSearchCreatedWithNullKeywords();
        whenInvokeExecute();
        thenVerifyReturnNoResults();
    }

    private void givenSiteSearchCreatedWithNullKeywords() {
        siteSearch = new SiteSearch();
    }
}
