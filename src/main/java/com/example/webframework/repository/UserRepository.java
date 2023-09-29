package com.example.webframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webframework.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
