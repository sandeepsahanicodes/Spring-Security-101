package com.sandeepsahanicodes.spring_security.service;

import com.sandeepsahanicodes.spring_security.dao.UserRepo;
import com.sandeepsahanicodes.spring_security.model.User;
import com.sandeepsahanicodes.spring_security.model.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);

        if(user == null) {
            System.out.println("User Not Found!!!");
            throw new UsernameNotFoundException("User Not Found!!!");
        }
        return new UserPrinciple(user);
    }
}