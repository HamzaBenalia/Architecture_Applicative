package org.epsi.user_microservice.services;
import org.epsi.user_microservice.domain.User;
import org.epsi.user_microservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create or Update
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    // Read all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Read by id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Delete
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
