package com.maxim.serverForGit.dto;

/**
 * @author Maxim Myroshnyk
 * @date 5/7/2023 7:01 PM
 */
public class UserLoginData {
    private String userName;
    private String password;

    public UserLoginData() {
    }

    public UserLoginData(String userName, String password) {
        this.userName = userName;
        this.password = password;
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
}
