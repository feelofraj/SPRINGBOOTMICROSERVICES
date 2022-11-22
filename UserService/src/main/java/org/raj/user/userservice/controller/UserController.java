package org.raj.user.userservice.controller;

import org.raj.user.userservice.DTO.User;
import org.raj.user.userservice.custom.UserNotFound;
import org.raj.user.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "user")
public class UserController {
@Autowired
private UserRepository userRepository;
    @RequestMapping(value = "home/{name}",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<String> home(@PathVariable String name){

        return new ResponseEntity<>("Hi Welcome "+name, HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "getUsers",produces = "application/json")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "createUser",method = RequestMethod.POST)
    public ResponseEntity<String> saveUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>("User created",HttpStatus.CREATED);
    }

    @RequestMapping(value = "updateUser",method = RequestMethod.PUT)
    public ResponseEntity<String> updateUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>("User Updated",HttpStatus.OK);
    }

    @RequestMapping(value = "getUserById",method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@RequestParam long id){
        Optional<User> userOptional=userRepository.findById(id);
        if(userOptional.isEmpty()){
            throw new UserNotFound();
        }
        return new ResponseEntity<>(userOptional.get(),HttpStatus.OK);
    }
}
