package com.maxim.serverForGit.dal;

import com.maxim.serverForGit.dto.SuccessfullLogin;
import com.maxim.serverForGit.dto.UserLoginData;
import com.maxim.serverForGit.dto.UsersDTO;
import com.maxim.serverForGit.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Maxim Myroshnyk
 * @date 5/7/2023 7:10 PM
 */
@Service
public interface IUserDal extends CrudRepository<User, Long> {
    @Query("Select new com.maxim.serverForGit.dto.UsersDTO(u.userName, u.password, u.age, u.city, u.gender, u.seekedGender, u.bio) from User u")
    List<UsersDTO> getAllUsers();

    @Query("Select new com.maxim.serverForGit.dto.UsersDTO(u.userName, u.password, u.age, u.city, u.gender, u.seekedGender, u.bio) from User u where u.id= :id")
    UsersDTO getUserById(@Param("id") long id);

//    @Query("Select new com.maxim.serverForGit.dto.UsersDTO(u.userName, u.password, u.age, u.city, u.gender, u.seekedGender, u.bio) from User u where u.userName= :userName")
//    UsersDTO getUserByName(@Param("userName") String userName);

    @Query("SELECT new com.maxim.serverForGit.dto.SuccessfullLogin(u.id) FROM User u where u.userName= :userName and u.password= :password")
    SuccessfullLogin login(@Param("userName") String userName, @Param("password") String password);
}
