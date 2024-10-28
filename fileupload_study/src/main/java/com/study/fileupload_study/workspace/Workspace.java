package com.study.fileupload_study.workspace;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Workspace {

    @Id @GeneratedValue
    @Column(name = "workspace_seq")
    private Long seq;

    @Column(nullable = false)
    @Size(min = 1, max = 255)
    private String name;

    @Lob
    private Blob thumbnail;

    @Column(nullable = false)
    private WorkspaceState state;

    @Size(max = 255)
    private String originTitle;

    @Size(max = 255)
    private String originSinger;
}
