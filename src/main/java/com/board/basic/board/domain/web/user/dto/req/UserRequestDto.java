package com.board.basic.board.domain.web.user.dto.req;

public class UserRequestDto {
    private String password; // 비밀번호
    private String name;     // 이름
    private String email;    // 이메일


    public UserRequestDto() {}

    // 사용자가 정보를 넣을 때 쓰는 생성자
    public UserRequestDto(String password, String name, String email) {
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
