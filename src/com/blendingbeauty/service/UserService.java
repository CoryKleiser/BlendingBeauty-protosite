package com.blendingbeauty.service;

import com.blendingbeauty.dao.IUserDAO;
import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.dto.UserData;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * User Service
 * Created by Cory Kleiser on 9/26/16.
 */
public class UserService implements IUserService {
    public IUserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Inject
    private IUserDAO userDAO;


    @Override
    public UserData getUserData(UserData userData) {
        return userData;
    }

    @Override
    public void saveUserData(UserData userData) throws Exception {

    }
}
