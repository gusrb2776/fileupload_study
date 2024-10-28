package com.study.fileupload_study.board.entity;

import com.study.fileupload_study.user.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Boards")
public class Board {

    @Id @GeneratedValue
    @Column(name = "board_seq")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "user_seq", nullable = false)
    private User user;

    @Column(nullable = false)
    @Size(min = 1, max = 255)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BoardState state;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Lob
    private Blob thumbnail;
}
