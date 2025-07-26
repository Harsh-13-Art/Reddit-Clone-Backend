package com.spring.project.reddit_clone.repository;

import com.spring.project.reddit_clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
