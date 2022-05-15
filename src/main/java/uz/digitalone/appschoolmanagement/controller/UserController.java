package uz.digitalone.appschoolmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.appschoolmanagement.dto.UserCreateDto;
import uz.digitalone.appschoolmanagement.entity.User;
import uz.digitalone.appschoolmanagement.service.UserService;
import uz.digitalone.appschoolmanagement.service.impl.UserServiceImpl;


@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/api/users")
    @PostMapping
    public User save(@RequestBody UserCreateDto dto) throws ClassNotFoundException {
        User savedUser = userService.save(dto);
        return savedUser;
    }

}
