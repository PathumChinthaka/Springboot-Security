package com.springboot.security.SpringbootSecurity.repository;

import com.springboot.security.SpringbootSecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity>findByEmail(String email);
}
