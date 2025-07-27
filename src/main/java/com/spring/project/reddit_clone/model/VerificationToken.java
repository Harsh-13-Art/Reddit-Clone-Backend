package com.spring.project.reddit_clone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;
import static jakarta.persistence.FetchType.LAZY;

@Data
@Entity
@Table(name = "token")
@AllArgsConstructor
@NoArgsConstructor
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    @OneToOne(fetch = LAZY)
    private User user;

    private Instant expiryDate;
}
