package com.example.userManagement.service;

import com.example.userManagement.domain.User;
import com.example.userManagement.exception.domain.EmailExistException;
import com.example.userManagement.exception.domain.UserNotFoundException;
import com.example.userManagement.exception.domain.UsernameExistException;

import javax.mail.MessagingException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email, String password) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
