package com.example.demo.domain.episode.entity;

import com.example.demo.domain.comment.entity.Comment;
import com.example.demo.domain.webtoon.entity.Webtoon;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "Episode")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "episode_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "postscript")
    private String postscript;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "webtoon_id")
    private Webtoon webtoon;

    @OneToMany(mappedBy = "episode")
    private List<Comment> commentList = new ArrayList<>();

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "views")
    private Integer views;

    @Column(name = "is_public")
    private boolean isPublic;

    @Column(name = "needed_cookie_amount")
    private int neededCookieAmount;

    @Column(name = "free_release_date")
    private LocalDateTime freeReleaseDate;

}
