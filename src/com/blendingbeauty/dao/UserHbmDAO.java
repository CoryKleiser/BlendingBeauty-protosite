package com.blendingbeauty.dao;

import com.blendingbeauty.dto.UserData;
import org.hibernate.Session;


/**
 * Created by moku on 9/26/16.
 */
public class UserHbmDAO implements IUserDAO {

    @Override
    public void insert(UserData userData) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        session.save(userData);

        session.getTransaction().commit();
    }

    @Override
    public void update(UserData userData) throws Exception {

    }

    @Override
    public void delete(UserData userData) throws Exception {

    }
}
