package com.example.hibernate_project;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;

    @Column(name = "comments")
    private String comments;


    public Review() {

    }

    public Review(String comments) {
        this.comments = comments;
    }

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
