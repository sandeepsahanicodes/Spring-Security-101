package com.sandeepsahanicodes.spring_security.service;

import com.sandeepsahanicodes.spring_security.dao.UserRepo;
import com.sandeepsahanicodes.spring_security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        /// Hashing the password word with Bcrypt hashing algorithm.
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
