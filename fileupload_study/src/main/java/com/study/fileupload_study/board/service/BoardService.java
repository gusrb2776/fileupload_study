package com.study.fileupload_study.board.service;

import com.study.fileupload_study.board.dto.BoardDto;
import com.study.fileupload_study.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class BoardService {

    private static BoardRepository boardRepository;

    public void test(MultipartFile file, BoardDto boardDto){

    }

}
