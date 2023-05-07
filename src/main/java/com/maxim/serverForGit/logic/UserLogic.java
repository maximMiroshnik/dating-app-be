package com.maxim.serverForGit.logic;

import com.maxim.serverForGit.dal.IUserDal;
import com.maxim.serverForGit.dto.UsersDTO;
import com.maxim.serverForGit.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Maxim Myroshnyk
 * @date 5/7/2023 6:55 PM
 */
@Service
public class UserLogic {
    private IUserDal userDal;

    @Autowired
    public UserLogic(IUserDal userDal) {
        this.userDal = userDal;
    }


    public List<UsersDTO> getAllUsers() {
        return userDal.getAllUsers();
    }

    public void updateUser(User user) {
        userDal.save(user);
    }

    public UsersDTO getUserById(long id) {
        return userDal.getUserById(id);
    }

    public void deleteAllUsers() {
         userDal.deleteAll();
    }


    public long createUser(User user) {
        userDal.save(user);
        return user.getId();
    }
}
