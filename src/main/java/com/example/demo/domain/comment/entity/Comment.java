package com.example.demo.domain.comment.entity;


import com.example.demo.domain.episode.entity.Episode;
import com.example.demo.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memebr;

    @ManyToOne
    @JoinColumn(name = "episode_id")
    private Episode episode;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
