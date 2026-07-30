package com.demo.workshop_management_api.resources;

import com.demo.workshop_management_api.entities.User;
import com.demo.workshop_management_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> findById(@PathVariable Long userId){
        User user = userService.findById(userId);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        user = userService.insert(user);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{userId}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> delete(@PathVariable Long userId){
        userService.delete(userId);
        return ResponseEntity.noContent().build();
    }
}
