package com.study.fileupload_study.board.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum BoardState {
    PRIVATE, PUBLIC;

    private int info;
}
