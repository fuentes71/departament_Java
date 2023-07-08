package com.projectTodo.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectTodo.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
