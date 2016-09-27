package com.blendingbeauty.dao;

import com.blendingbeauty.dto.UserData;

import java.util.List;

/**
 * Created by moku on 9/26/16.
 */
public interface IUserDAO {

    public void insert(UserData userData) throws Exception;

    public void update(UserData userData) throws  Exception;

    public void delete(UserData userData) throws  Exception;

}
