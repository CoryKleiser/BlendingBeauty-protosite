package com.blendingbeauty.dao;

import com.blendingbeauty.dto.Post;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by moku on 9/28/16.
 */
public interface IPostDAO {

    List<Post> fetchPosts();

    void insert(Session session, Post post) throws Exception;

    void update (Post post) throws Exception;

    void delete (Post post) throws Exception;

    List<Post> fetchPosts(Post post);

    void save(Post post) throws Exception;

}
