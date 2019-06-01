package com.canghai.zhihucopy.service;

import com.canghai.zhihucopy.domain.User;
import com.canghai.zhihucopy.mapper.UserMapper;
import com.canghai.zhihucopy.utils.ErrorCode;
import com.canghai.zhihucopy.utils.InformationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user){
        return userMapper.insert(user);
    }

    public int delete(int userId){
        return userMapper.delete(userId);
    }

    public User findUser(int userId){
        return userMapper.selectUserByUserId(userId);
    }

    public List<User> findUsersByUserName(String userName){
        return userMapper.selectUsersByUserName(userName);
    }

    public int updateUserInfo(User user){
        return userMapper.updateInfo(user);
    }

    public int changePassword(User user){
        return userMapper.changePassword(user);
    }

    public int updateNumber(User user){
        return userMapper.updateNumber(user);
    }
    public int setForbidden(User user){
        return userMapper.setForbidden(user);
    }
    public int setDeleted(User user){
        return userMapper.setDeleted(user);
    }


    public User findUserByAccountAndPassword(String account,String password){
        //check account and password not null
        checkAccountAndPassword(account,password);
        return userMapper.selectUserByAccountAndPassword(account,password);
    }

    private void checkAccountAndPassword(final String account,final String password){
        if (StringUtils.isEmpty(account)||StringUtils.isEmpty(password)){
            throw new InformationException(ErrorCode.USER_ACCOUNT_PASSWORD_NOT_NULL);
        }
    }
}
