package test.spring.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.pojo.User;
import test.spring.service.UserService;

public class Invoker {

    User user;


    @Test
    public void testSpring(){

        ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) ac.getBean("userService");
        user = userService.userInfo();

        System.out.println("result:"+user.getUsername());
    }

}
