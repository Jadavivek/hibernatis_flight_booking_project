package com.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bus.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
