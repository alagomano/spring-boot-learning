package com.demo.workshop_management_api.services;

import com.demo.workshop_management_api.entities.User;
import com.demo.workshop_management_api.repositories.UseRepository;
import com.demo.workshop_management_api.services.exceptions.DatabaseException;
import com.demo.workshop_management_api.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return user.orElseThrow(() -> new ResourceNotFoundException(userId));
    }

    public User  insert(User user){
        return useRepository.save(user);
    }

    public void delete(Long userId){
        try{
        if (!useRepository.existsById(userId)) {
            throw new ResourceNotFoundException(userId);
        }

        useRepository.deleteById(userId);

        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User  update(Long userId, User user){
        try {
            User entity = useRepository.getReferenceById(userId);
            updateData(entity, user);
            return useRepository.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(userId);
        }
    }

    private void updateData(User userBefore, User userAfter){
        userBefore.setName(userAfter.getName());
        userBefore.setEmail(userAfter.getEmail());
        userBefore.setPhone(userAfter.getPhone());
    }
}
