package com.spring.project.reddit_clone.repository;

import com.spring.project.reddit_clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
