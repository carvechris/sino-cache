package com.carvechris.cache.test.unit;

import com.carvechris.cache.test.CacheTest;
import com.carvechris.cache.test.entity.User;
import com.carvechris.cache.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ifs on 2017/5/21.
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = CacheTest.class) // 指定我们SpringBoot工程的Application启动类
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        userService.get("test");
        userService.get("test");
    }

    @Test
    public void testGetList() {
        userService.getLlist();
        userService.getLlist();
    }

    @Test
    public void testGetSet() {
        userService.getSet();
        userService.getSet();
    }

    @Test
    public void testGetMap(){
        userService.getMap();
        userService.getMap();
    }
    @Test
    public void testSave(){
        userService.save(new User("carvechris",25,"carvechris"));
    }

    @Test
    public void testByKeyGenerator(){
        userService.get(28);
        userService.get(28);
    }
}
