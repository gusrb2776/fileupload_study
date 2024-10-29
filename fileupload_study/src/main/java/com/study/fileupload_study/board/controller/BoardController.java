package com.study.fileupload_study.board.controller;

import com.study.fileupload_study.board.dto.BoardDto;
import com.study.fileupload_study.board.service.BoardService;
import jakarta.persistence.Column;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    private static BoardService boardService;

    @PostMapping("/boards")
    public ResponseEntity<String> test(@RequestBody MultipartFile file, BoardDto boardDto){
        boardService.test(file, boardDto);

        return ResponseEntity.ok("hi");
    }
}
