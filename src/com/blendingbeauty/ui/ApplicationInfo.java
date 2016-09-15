package com.blendingbeauty.ui;
/**
 * Created by moku on 9/13/16.
 */

import javax.annotation.ManagedBean;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")
public class ApplicationInfo {

    String slogan = "Welcome to Blending Beauty. " +
            "Revealing expert makeup techniques " +
            "and giving you the best product demos";

    public String getSlogan(){
        return slogan;
    }
    public void setSlogan(String slogan){
        this.slogan = slogan;
    }


}
