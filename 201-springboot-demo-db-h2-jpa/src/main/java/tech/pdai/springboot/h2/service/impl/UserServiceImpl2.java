package tech.pdai.springboot.h2.service.impl;

import org.springframework.stereotype.Service;
import tech.pdai.springboot.h2.entity.User;
import tech.pdai.springboot.h2.service.UserService;

import java.util.ArrayList;
import java.util.List;
@Service("userServiceImpl2")
public class UserServiceImpl2 implements UserService {
    @Override
    public void addUser(User user) {

    }

    @Override
    public List<User> list() {
        System.out.println("hello");
        return null;
    }
}
