package com.maxim.serverForGit.logic;

import com.maxim.serverForGit.dal.IUserDal;
import com.maxim.serverForGit.dto.UsersDTO;
import com.maxim.serverForGit.entities.User;
import com.maxim.serverForGit.enums.ErrorType;
import com.maxim.serverForGit.exceptions.ServerException;
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

    public long createUser(User user) throws ServerException {
        // Validations
        try {
            userDal.save(user);
            return user.getId();
        }
        catch (Exception e){
            throw new ServerException(ErrorType.GENERAL_ERROR,"Failed to create user"+user.toString(),e);
        }
    }


    public void deleteUser(long id) throws ServerException {
        try {
            userDal.deleteById(id);
        }
        catch (Exception e){
            throw new ServerException(ErrorType.GENERAL_ERROR,"Failed to remove user id: "+id,e);
        }
    }
}
