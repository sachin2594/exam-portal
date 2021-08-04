package com.examserver.controller;


import com.examserver.model.Role;
import com.examserver.model.User;
import com.examserver.model.UserRole;
import com.examserver.repository.UserRepository;
import com.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class ApplicationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) throws Exception {

       User user1 = userRepository.findByUserName(user.getUserName());
       if (user1!= null){
           throw new Exception("User already exists!!");
       }else {
           user.setProfile("default.png");
           user.setRole("NORMAL");
       }
        return userRepository.save(user);
    }

    @GetMapping("/fetchall")
    public List<User> fetchAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userName}")
    public User fetchByUserName(@PathVariable("userName") String userName) throws Exception {
        User user = userRepository.findByUserName(userName);
        if (user == null)
            throw new Exception("User Does not exists!!");
        return user;
    }

    @DeleteMapping("/{userName}")
    public void deleteByUserName(@PathVariable("userName") Long id) throws Exception{
        Optional<User> user = userRepository.findById(id);
        if (user == null)
            throw new Exception("User Does not exists!!");
        userRepository.deleteById(id);
    }
}
