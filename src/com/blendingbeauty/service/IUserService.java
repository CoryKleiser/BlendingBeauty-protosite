package com.blendingbeauty.service;

import com.blendingbeauty.dto.UserData;

/**
 * IUserInterface contains business logic for User Data
 * @author Cory Kleiser
 */
public interface IUserService {

    /**
     * Return on collection of User Data
     * @param userData a substring that should be contained in returned text
     * @return a collection of search terms containing filtered text
     */
    UserData getUserData(UserData userData);


    /**
     * Saves Keyword to server for future client queries
     * @param userData the keyword we are persisting
     * @throws Exception unable to save
     */
    void saveUserData(UserData userData) throws Exception;

}
