package com.github.mattkain99.LANOrganizer.repositories;

import com.github.mattkain99.LANOrganizer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUserName(String userName);


}