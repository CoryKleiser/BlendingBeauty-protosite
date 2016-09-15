package com.blendingbeauty.dto;

/**
 * Created by moku on 9/15/16.
 */

import javax.annotation.ManagedBean;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")
public class UserData {
    private String name;
    private   String userId;
    private String userStatus;
    private int pointCount;

    public UserData(){
        name = "Guest";
        userId = "0";
        userStatus = "Visitor";
        pointCount = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}