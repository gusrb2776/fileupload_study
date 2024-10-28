package com.study.fileupload_study.board.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum BoardState {
    PRIVATE, PUBLIC;

    private int num;
}
