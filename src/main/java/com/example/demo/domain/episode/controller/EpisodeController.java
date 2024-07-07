package com.example.demo.domain.episode.controller;

import com.example.demo.domain.episode.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EpisodeController {

    private final EpisodeRepository episodeRepository;



}
