package com.example.BookStore.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookStore.Exception.ResourceNotFoundException;
import com.example.BookStore.Model.User;
import com.example.BookStore.Repository.UserRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserContoller {

    @Autowired
    private UserRepository userRepository;


    //getallCustomer
    @GetMapping("/users")
    public List<User> getAllUser()
    {
        return  userRepository.findAll();
    }

     //post Customer
     @PostMapping("/")
     public User addCustomer(@RequestBody User user)
     {
         return userRepository.save(user);
     }
    
      //update Customer
    @PutMapping("/{id}")
    public ResponseEntity<User> updateCustomer(@PathVariable long id, @RequestBody User user)
    {
        User usr = userRepository.findById(id) 
        .orElseThrow(() ->   new ResourceNotFoundException("Invalid Id"));
        usr.setFirstname(user.getFirstname());
        usr.setLastname(user.getLastname());
        usr.setEmail(user.getEmail());
        User use = userRepository.save(usr);
        return ResponseEntity.ok(use);
    }


     //get Customer by id
     @GetMapping("/firsname")
     public ResponseEntity<List<User>> getUserByfirstname(@RequestParam String firstname)
     {
         return new ResponseEntity<List<User>>(userRepository.findByfirstname(firstname), HttpStatus.OK);
     }
 
     //delete Customer
     @DeleteMapping("/{id}")
     public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable long id)
     {
       User user =userRepository.findById(id)
         .orElseThrow();
         userRepository.delete(user);
 
         Map<String,Boolean> response = new HashMap<>();
         response.put("Deleted",Boolean.TRUE);
         return ResponseEntity.ok(response);
     }
    
} 
