package com.board.basic.board.domain.web.user.entity.repository;

import com.board.basic.board.domain.web.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    void insertUser(User user); // 사용자 등록
    User selectUser(Long id); // 사용자 조회
    void updateUser(User user); // 사용자 수정
    void deleteUser(Long id); // 사용자 삭제
}
