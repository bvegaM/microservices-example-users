package com.bvega.user.service.service;

import com.bvega.user.service.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getOneById(Long id);
    User save(User user);
}
