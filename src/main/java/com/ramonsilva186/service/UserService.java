package com.ramonsilva186.service;

import com.ramonsilva186.domain.model.User;

public interface UserService {

    User findByID(Long id);
    User create(User userToCreate);
}
