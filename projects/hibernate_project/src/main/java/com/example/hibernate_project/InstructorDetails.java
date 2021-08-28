package com.example.hibernate_project;

import javax.persistence.*;

@Entity
@Table(name = "instructor_details")
public class InstructorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ins_id")
    private int ins_id;
    @Column(name = "youtube_channel")
    private String youtube_channel;

    @OneToOne(mappedBy = "instructorDetails", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    private Instructor instructor;

    public InstructorDetails() {

    }

    public InstructorDetails(String youtube_channel) {
        this.youtube_channel = youtube_channel;
    }

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public String getYoutube_channel() {
        return youtube_channel;
    }

    public void setYoutube_channel(String youtube_channel) {
        this.youtube_channel = youtube_channel;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
