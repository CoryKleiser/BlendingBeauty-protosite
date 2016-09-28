package com.blendingbeauty.ui;

import com.blendingbeauty.dto.Post;
import com.blendingbeauty.dto.SearchEntry;
import com.blendingbeauty.service.IPostService;
import com.blendingbeauty.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Logger;

@Named
@ManagedBean
@Scope("session")
public class AddSiteContent {

    final static Logger logger = Logger.getLogger(String.valueOf(AddSiteContent.class));


    private Post post;

    @Autowired
    private IPostService postService;

    private String message = "foo";

    public String execute() {
        logger.info("Entering the Execute method");
        String returnValue = "";

        // get faces context
        FacesContext currentInstance = FacesContext.getCurrentInstance();

        try {
            postService.save(post);

            logger.info("Save successful " + post.toString());

            // what is the message that we want to show?
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", "Plant Saved");
            // display the message
            currentInstance.addMessage(null, fm);

        } catch (Exception e) {
            logger.severe("Error while saving plant.  Message: " + e.getMessage());

            e.printStackTrace();
            returnValue = "fail";

            // what is the message that we want to show?
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unable to Save", "Plant not Saved");
            // display the message
            currentInstance.addMessage(null, fm);

        }
        return returnValue;
    }

    public Post getPost() { return post; }

    public void setPost(Post post) {
        this.post = post;
    }

    public IPostService getPostService() {
        return postService;
    }

    public void setPostService(IPostService postService) {
        this.postService = postService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
