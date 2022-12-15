package com.microservice.rest.rest.web.service.Service;

import com.microservice.rest.rest.web.service.IService.IUserService;
import com.microservice.rest.rest.web.service.domain.User;
import com.microservice.rest.rest.web.service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {
     return userRepository.findById(id).orElse(null);

    }

    @Override
    public void addUser(User user) {
    userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
