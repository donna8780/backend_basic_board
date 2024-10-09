package com.board.basic.board.domain.web.user.dto.resp;

import com.board.basic.board.domain.web.user.entity.User;

//기존 사용자 정보 조회
public record UserResponseDto(Long Id, String name, String email) {
   public UserResponseDto(User user){
       this(user.getId(), user.getName(), user.getEmail());
   }


}
