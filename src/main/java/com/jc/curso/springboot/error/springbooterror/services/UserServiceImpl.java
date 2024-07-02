package com.jc.curso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jc.curso.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Andres", "Mena"));
        users.add(new User(3L, "Maria", "Perez"));
        users.add(new User(4L, "Josefa", "Ramirez"));
        users.add(new User(5L, "Ale", "Gutierrez"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User fingById(Long id) {
        User user = null;
        for (User u : users) {
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }
        return user;
        
    }

}
