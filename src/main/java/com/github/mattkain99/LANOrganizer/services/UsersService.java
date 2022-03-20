package com.github.mattkain99.LANOrganizer.services;

import com.github.mattkain99.LANOrganizer.models.User;
import com.github.mattkain99.LANOrganizer.repositories.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    // Fields
    private final UsersRepository usersRepository;

    // Constructor
    public UsersService(UsersRepository userRepo){
        this.usersRepository = userRepo;
    }

    // Methods...
    public User getUserByUserName(String userName){
        return this.usersRepository
                .findByUserName(userName)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
