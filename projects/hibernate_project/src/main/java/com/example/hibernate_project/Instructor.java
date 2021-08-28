package com.example.hibernate_project;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ins_id")
    private InstructorDetails instructorDetails;

    @OneToMany(mappedBy = "instructor",
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST} ,
            fetch = FetchType.LAZY)
    private List<Course> courseList;


    public Instructor() {

    }

    public Instructor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public InstructorDetails getInstructorDetails() {
        return instructorDetails;
    }

    public void setInstructorDetails(InstructorDetails instructorDetails) {
        this.instructorDetails = instructorDetails;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void add(Course tempCourse) {
        if(courseList == null) {
            courseList = new ArrayList<>();
        }

        courseList.add(tempCourse);
        tempCourse.setInstructor(this);
    }
}
