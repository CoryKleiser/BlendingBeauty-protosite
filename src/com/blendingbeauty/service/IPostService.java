package com.blendingbeauty.service;

import com.blendingbeauty.dto.Post;

import java.util.List;

/**
 * Created by moku on 9/28/16.
 */
public interface IPostService {

    public List<Post> filterPosts(String filter);

    /**
     * Save the plant and perform a validation check.
     * @param post the plant we are persisting
     * @throws Exception if unable to save
     */
    void save(Post post) throws Exception;

    /**
     *  Return a list of plants that match the given search criteria
     * @param post a parameter that contains the search criteria
     * @return a list of matching plants
     */
    List<Post> fetchPosts(Post post);

}
