package com.example.service;

import com.example.entity.User;
import com.example.exception.domain.EmailExistException;
import com.example.exception.domain.UserNotFoundException;
import com.example.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {
    User register( String firstName, String lastName, String username, String email ) throws UserNotFoundException, EmailExistException, UsernameExistException;
    List<User> getUsers();
    User findUserByUsername( String username );
    User findUserByEmail( String email );
}
