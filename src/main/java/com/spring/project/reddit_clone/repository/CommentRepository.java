package com.spring.project.reddit_clone.repository;

import com.spring.project.reddit_clone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
