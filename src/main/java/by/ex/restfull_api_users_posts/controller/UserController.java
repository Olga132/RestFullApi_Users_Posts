package by.ex.restfull_api_users_posts.controller;

import by.ex.restfull_api_users_posts.entity.UserEntity;
import by.ex.restfull_api_users_posts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public @ResponseBody List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/addUser")
    public String add(@RequestBody UserEntity userEntity){
        userService.addUser(userEntity);
        return userEntity.toString();
    }

}
