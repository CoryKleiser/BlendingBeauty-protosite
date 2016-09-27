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
    private int userId;
    private String userStatus;
    private int pointCount;

    public UserData(){
        name = "Guest";
        userId = 0;
        userStatus = "Visitor";
        pointCount = 0;
    }

    //TODO: adjust getter and setters

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    public int getPointCount() {
        return pointCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}