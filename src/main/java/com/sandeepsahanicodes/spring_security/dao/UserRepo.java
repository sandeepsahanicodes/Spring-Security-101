package com.sandeepsahanicodes.spring_security.dao;

import com.sandeepsahanicodes.spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
