package com.microservice.rest.rest.web.service.RestController;

import com.microservice.rest.rest.web.service.IService.IUserService;
import com.microservice.rest.rest.web.service.domain.User;
import org.apache.tomcat.util.http.HeaderUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {
    private final IUserService userService;

    UserRestController(IUserService userService){
        this.userService = userService;
    }
    @GetMapping("")
    public ResponseEntity<List<User>> retrieveAllUsers(){
        List<User> retrievedUsers = userService.getAllUsers();
        return ResponseEntity
                .ok()
                .body(retrievedUsers);

    }
    @GetMapping("/{id}")
    public User retrieveUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }
        @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
