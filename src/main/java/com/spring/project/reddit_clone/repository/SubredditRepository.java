package com.spring.project.reddit_clone.repository;

import com.spring.project.reddit_clone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
