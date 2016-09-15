package com.blendingbeauty.ui;

/**
 * Created by moku on 9/15/16.
 */

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")
public class UserInfo {

    @Inject
    private UserInfo userInfo;

    //TODO:: implement user account functionality

}
