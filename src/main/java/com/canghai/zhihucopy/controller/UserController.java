package com.canghai.zhihucopy.controller;

import com.canghai.zhihucopy.domain.User;
import com.canghai.zhihucopy.domain.UserRequest;
import com.canghai.zhihucopy.service.UserService;
import com.canghai.zhihucopy.utils.GeneralResponse;
import com.canghai.zhihucopy.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final long Token_Invalid_Time= 3600 * 24 * 15 *1000;
    @Autowired
    private UserService userService;

    public GeneralResponse toLogin(@RequestBody UserRequest userRequest){
        User user = null;
        user=userService.findUserByAccountAndPassword(userRequest.getAccount(),userRequest.getPassword());
        String jwtToken;
        if (user==null){
            return GeneralResponse.ofFail("用户不存在或密码错误");
        }else{
            jwtToken = JwtHelper.createJWT(String.valueOf(user.getUserID()),user.getUserName(),Token_Invalid_Time);
            System.out.println(jwtToken);
            return GeneralResponse.ofData(jwtToken);
        }
    }
}
