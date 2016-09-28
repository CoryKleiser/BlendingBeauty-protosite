package com.blendingbeauty.dto;

import org.springframework.context.annotation.Scope;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 * Created by moku on 9/28/16.
 */
@Named
@ManagedBean
@Scope("session")
public class Post{

    private String title;
    private String topics;
    private String content;
    private String author;
    private int guid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return title + "  " + topics + " " + content + " " + author;
    }

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

}