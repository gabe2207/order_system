package com.arumaco.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arumaco.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
