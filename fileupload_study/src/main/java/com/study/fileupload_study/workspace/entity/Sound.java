package com.study.fileupload_study.workspace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sound {

    @Id @GeneratedValue
    @Column(name = "sound_seq")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "workspace_seq")
    private Workspace workspace;

    private Integer startPoint;

    private Integer endPoint;

    @Enumerated(EnumType.STRING)
    private SoundType type;
}
