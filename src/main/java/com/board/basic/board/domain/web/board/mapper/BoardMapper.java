package com.board.basic.board.domain.web.board.mapper;


import com.board.basic.board.domain.web.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 등록
    void insertBoard(Board board);

    // 게시글 조회
    Board selectBoard(Long id);

    // 모든 게시글 조회
    List<Board> selectAllBoard();

    // 게시글 수정
    void updateBoard(Board board);

    // 게시글 삭제
    void deleteBoard(Long id);
}
