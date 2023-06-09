package com.maxim.serverForGit.entities;

import com.maxim.serverForGit.enums.Gender;

import javax.persistence.*;

/**
 * @author Maxim Myroshnyk
 * @date 5/7/2023 6:50 PM
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "seekedGender", nullable = false)
    private Gender seekedGender;

    @Column(name = "bio", nullable = true)
    private String bio;

    public User(long id, String userName, String password, int age, String city, Gender gender, Gender seekedGender, String bio) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getSeekedGender() {
        return seekedGender;
    }

    public void setSeekedGender(Gender seekedGender) {
        this.seekedGender = seekedGender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
