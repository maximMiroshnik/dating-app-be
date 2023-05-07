package com.maxim.serverForGit.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.maxim.serverForGit.dto.UserLoginData;
import com.maxim.serverForGit.dto.UsersDTO;
import com.maxim.serverForGit.entities.User;
import com.maxim.serverForGit.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.maxim.serverForGit.exceptions.ServerException;


import java.util.List;

/**
 * @author Maxim Myroshnyk
 * @date 5/7/2023 6:54 PM
 */
@RestController
@RequestMapping("/users")
public class UserController {
    private UserLogic userLogic;

    @Autowired
    public UserController(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @PostMapping
    public void createUser(@RequestBody User user) throws ServerException {
        userLogic.createUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLoginData userLoginData) throws ServerException, JsonProcessingException {
        return "token";
    }

    @PutMapping
    public void updateUser(@RequestBody User user) throws ServerException {
        userLogic.updateUser(user);
    }

    @GetMapping
    public List<UsersDTO> getAllUsers() {
        return userLogic.getAllUsers();
    }

    @GetMapping("/{id}")
    public UsersDTO getUserById(@PathVariable long id) {
        return userLogic.getUserById(id);
    }

    @DeleteMapping
    public void deleteAllUsers() {
        userLogic.deleteAllUsers();
    }

    @DeleteMapping("{userId}")
    public void removeUser(@PathVariable("userId") int userId) throws ServerException {
        this.userLogic.deleteUser(userId);
    }
}
