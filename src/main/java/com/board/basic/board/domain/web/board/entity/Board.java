package com.board.basic.board.domain.web.board.mapper;

import lombok.Data;

@Data
public class Board {


	private Long id;

	private String title; // 게시판 제목
	private String content;// 게시판 내용
	private String name;// 게시판 작성자

	public Board() {
	}

	public Board(Long id, String title, String content, String name) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.name = name;
	}


}
