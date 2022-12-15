package com.microservice.rest.rest.web.service.IService;

import com.microservice.rest.rest.web.service.domain.User;

import java.util.List;
import java.util.Set;

public interface IUserService {
    public List<User> getAllUsers();
    public User getUser(Integer id);
    public void addUser(User user);
    public void deleteUser(Integer id);
}
