package com.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.practice.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	
	
}
