package com.blendingbeauty.dao;

import com.blendingbeauty.dto.Post;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

/**
 * Created by moku on 9/28/16.
 */
public class PostHbmDAO implements IPostDAO {
    @Override
    public List<Post> fetchPosts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        // create the query
        Query query = session.createQuery("from Post");
        @SuppressWarnings("rawtypes")
        List list = query.list();

        List<Post> posts = Collections.checkedList(list, Post.class);

        return posts;
    }
    @Override
    @SuppressWarnings("unchecked")
    public List<Post> fetchPosts(Post post) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        // create the query
        Query query = session.createQuery("from Post where title like :title");
        query.setParameter("title", "%" + post.getTitle() + "%");
        // query.setProperties(plant);
        @SuppressWarnings("rawtypes")
        List list = query.list();

        List<Post> posts = list; //Collections.checkedList(list, Plant.class);

        return posts;
    }

    @Override
    public void save(Post post) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        insert(session, post);

        session.getTransaction().commit();
    }


    @Override
    public void insert(Session session, Post post) throws Exception {
        session.save(post);
    }

    @Override
    public void update(Post post) throws Exception {

    }

    @Override
    public void delete(Post post) throws Exception {
        //TODO: delete(Post post) in PostHbmDAO
    }
}
