package com.board.basic.board.domain.web.user.entity;

public class User {

	private Long id; // 사용자 ID
	private String password; // 사용자 비밀번호
	private String name; // 사용자 이름
	private String email; // 사용자 이메일

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
