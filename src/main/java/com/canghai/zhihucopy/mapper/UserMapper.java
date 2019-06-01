package com.canghai.zhihucopy.mapper;

import com.canghai.zhihucopy.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int insert(User user);
    int delete(int userId);
    User selectUserByUserId(int userId);
    List<User> selectUsersByUserName(String userName);
    int updateInfo(User user);
    int changePassword(User user);
    int updateNumber(User user);
    int setDeleted(User user);
    int setForbidden(User user);
    User selectUserByAccountAndPassword(@Param("account") String account,@Param("password") String password);
}
