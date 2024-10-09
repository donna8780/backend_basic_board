package com.board.basic.board.domain.web.board.service;

import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    //BoardMapper.java 주입 받아 db작업 호출
    private final BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper){
        this.boardMapper = boardMapper;
    }

	// 게시판 목록 조회

    public List<Board> allBoard(){
        return boardMapper.selectAllBoard();
    }

	// 게시판 상세 조회
    public Board getBoard(Long id){
        return boardMapper.selectBoard(id);
    }

	// 게시판 등록
    public void registBoard(Board board){
        boardMapper.insertBoard(board);
    }

	// 게시판 수정
    public void updateBoard(Board board){
        boardMapper.updateBoard(board);
    }

	// 게시판 삭제
    public void deleteBoard(Long id){
        boardMapper.deleteBoard(id);
    }
}
