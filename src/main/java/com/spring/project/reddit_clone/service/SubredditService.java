package com.spring.project.reddit_clone.service;


import com.spring.project.reddit_clone.dto.SubredditDto;
import com.spring.project.reddit_clone.model.Subreddit;
import com.spring.project.reddit_clone.repository.SubredditRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SubredditService {

    private final SubredditRepository subredditRepository;

    @Transactional
    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit savedSubreddit = subredditRepository.save(mapSubredditDto(subredditDto));
        subredditDto.setId(savedSubreddit.getId());
        return subredditDto;
    }

    private Subreddit mapSubredditDto(SubredditDto subredditDto) {
        return Subreddit.builder().name(subredditDto.getName())
                .description(subredditDto.getDescription())
                .build();
    }

    @Transactional
    public List<SubredditDto> getAllSubreddits() {
        return subredditRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    private SubredditDto mapToDto(Subreddit subreddit) {
        return SubredditDto.builder().name(subreddit.getName())
                .id(subreddit.getId())
                .numberOfPosts(subreddit.getPosts().size())
                .build();
    }
}
