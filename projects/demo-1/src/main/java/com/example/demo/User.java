package com.example.demo;

import com.example.validation.CourseCode;

import javax.validation.constraints.*;

public class User {

    @NotEmpty(message="is required")
    private String firstname;

    @NotEmpty(message = "is required")
    private String lastname;

    @Min(value=0, message="Must be greater than zero")
    @Max(value=15, message="Must be less than fifteen")
    @NotNull(message = "is required")
    private Integer age;

    @CourseCode
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
