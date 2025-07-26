package com.spring.project.reddit_clone.repository;

import com.spring.project.reddit_clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
