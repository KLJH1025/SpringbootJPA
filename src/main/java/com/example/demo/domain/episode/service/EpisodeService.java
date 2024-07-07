package com.example.demo.domain.episode.service;

import com.example.demo.domain.episode.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;


}
