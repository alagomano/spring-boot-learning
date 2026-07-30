package com.demo.workshop_management_api.services;

import com.demo.workshop_management_api.entities.User;
import com.demo.workshop_management_api.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UseRepository useRepository;

    public List<User> findAll(){
        return useRepository.findAll();
    }

    public User findById(Long userId){
        Optional<User> user = useRepository.findById(userId);
        return user.get();
    }

    public User  insert(User user){
        return useRepository.save(user);
    }

    public void delete(Long userId){
        useRepository.deleteById(userId);
    }

    public User  update(Long userId, User user){
        User entity = useRepository.getReferenceById(userId);
        updateData(entity, user);
        return useRepository.save(entity);
    }

    private void updateData(User userBefore, User userAfter){
        userBefore.setName(userAfter.getName());
        userBefore.setEmail(userAfter.getEmail());
        userBefore.setPhone(userAfter.getPhone());
    }
}
