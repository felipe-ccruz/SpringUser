package com.felp.springuser.resources;

import com.felp.springuser.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//LINK: http://localhost:8080/users
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findall(){
        User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
