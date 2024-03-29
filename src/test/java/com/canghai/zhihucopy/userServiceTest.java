package com.canghai.zhihucopy;

import com.canghai.zhihucopy.domain.User;
import com.canghai.zhihucopy.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findOneTest(){
        User result = userService.findUser(1);
        System.out.println(result);
        Assert.assertNull(result.getPhoto());
    }

}
