package com.study.fileupload_study.board.dto;

import com.study.fileupload_study.board.entity.BoardState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {
    private String title;
    private BoardState state;
    private String content;
}
