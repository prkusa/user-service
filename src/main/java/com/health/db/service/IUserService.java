
package com.health.db.service;

import com.health.db.dto.UserDTO;
import com.health.db.entity.User;

import java.util.List;

public interface IUserService {
    User createUser(UserDTO userDTO);
    User updateUser(Long id, UserDTO userDTO);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
