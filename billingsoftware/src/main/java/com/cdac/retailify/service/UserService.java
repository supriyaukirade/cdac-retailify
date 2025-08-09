package com.cdac.retailify.service;

import java.util.List;

import com.cdac.retailify.io.UserRequest;
import com.cdac.retailify.io.UserResponse;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
