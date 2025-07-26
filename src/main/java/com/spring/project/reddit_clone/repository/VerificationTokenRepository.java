package com.spring.project.reddit_clone.repository;

import com.spring.project.reddit_clone.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
