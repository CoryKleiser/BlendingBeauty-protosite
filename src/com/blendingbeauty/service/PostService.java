package com.blendingbeauty.service;

import com.blendingbeauty.dao.IPostDAO;
import com.blendingbeauty.dto.Post;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by moku on 9/28/16.
 */
@Named
public class PostService implements IPostService {

    @Inject
    private IPostDAO postDAO;

    private List<Post> allPosts;

    @Override
    public List<Post> filterPosts(String filter) {

        if (allPosts == null) {
            allPosts = getPostDAO().fetchPosts();
        }

        // the collection we are returning.
        List<Post> returnPosts = new ArrayList<Post>();

        // filter the list.
        // interview all possible plants (allPlants), and move plants that contain the filter text into our subset collection (returnPlans)
        for (Post post : allPosts) {
            if (post.toString().contains(filter)) {
                // this plant matches our criteria, so add it to the collection that will be returned from this method.
                returnPosts.add(post);
            }
        }

        // TODO Auto-generated method stub
        return returnPosts;
    }

    public void save(Post post) throws Exception {
        if (post.getTitle() == null || post.getTitle().isEmpty()) {
            throw new Exception ("Title required");
        }
        postDAO.save(post);

    }


    @Override
    public List<Post> fetchPosts(Post post) {
        List<Post> posts = postDAO.fetchPosts(post);
        return posts;
    }

    public IPostDAO postDAO() {
        return postDAO;
    }

    public void setPostDAO(IPostDAO postDAO) {
        this.postDAO = postDAO;
    }


    public IPostDAO getPostDAO() {
        return postDAO;
    }
}
