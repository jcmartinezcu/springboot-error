package com.jc.curso.springboot.error.springbooterror.services;

import java.util.List;

import com.jc.curso.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    List<User> findAll();
    User fingById(Long id);

}
