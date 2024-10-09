package com.board.basic.board.domain.web.board.controller;

import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

	// 게시판 상세 조회

	// 게시판 등록
    @PostMapping("/boards/register")
    public String registerBoard(@ModelAttribute Board board){
        System.out.println("등록요청:" +board);
        boardService.registBoard(board);
        return "redirect:/boards/list";
    }

    // 게시판 목록 조회
    @GetMapping("/boards/list")
    public String BoardList(Model model) {
        List<Board> boards = boardService.allBoard();
        model.addAttribute("boards", boards);
        return "list";
    }
	// 게시판 수정
    @PostMapping("/boards/edit/{id}")
    public String ediBoard(@PathVariable Long id, @ModelAttribute Board board){
        board.setId(id);
        boardService.updateBoard(board);
        return "redirect:/boards/list"; //목록으로 리다이렉트
    }
    

	// 게시판 삭제
    @PostMapping("/boards/delete/{id}")
    public String deleteBoard(@PathVariable Long id){
        boardService.deleteBoard(id);
        return "redirect:/boards/list";
    }


}
