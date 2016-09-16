package com.blendingbeauty.ui;

import com.blendingbeauty.dto.SearchEntry;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


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

    public List<SearchEntry> completeEntry(String Query){
        ArrayList<SearchEntry> keywords = new ArrayList<SearchEntry>();

        //find keywords and add to selection
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
}
