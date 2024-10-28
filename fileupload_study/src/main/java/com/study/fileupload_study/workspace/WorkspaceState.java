package com.study.fileupload_study.workspace;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum WorkspaceState {
    PRIVATE, PUBLIC;

    private int info;
}
