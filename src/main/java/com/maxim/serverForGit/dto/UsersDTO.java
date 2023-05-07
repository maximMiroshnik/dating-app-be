package com.maxim.serverForGit.dto;

import javax.persistence.Column;

/**
 * @author Maxim Myroshnyk
 * @date 5/7/2023 7:01 PM
 */
public class UsersDTO {
    private long id;

    private String userName;

    private String password;

    private int age;

    private String city;

    private String gender;

    private String seekedGender;

    private String bio;

    public UsersDTO(long id, String userName, String password, int age, String city, String gender, String seekedGender, String bio) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.seekedGender = seekedGender;
        this.bio = bio;
    }

    public UsersDTO(String userName, String password, int age, String city, String gender, String seekedGender, String bio) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.seekedGender = seekedGender;
        this.bio = bio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSeekedGender() {
        return seekedGender;
    }

    public void setSeekedGender(String seekedGender) {
        this.seekedGender = seekedGender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
