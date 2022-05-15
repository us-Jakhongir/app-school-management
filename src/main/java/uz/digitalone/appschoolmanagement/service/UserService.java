package uz.digitalone.appschoolmanagement.service;

import uz.digitalone.appschoolmanagement.dto.UserCreateDto;
import uz.digitalone.appschoolmanagement.entity.User;


public interface UserService {

    User save(UserCreateDto dto) throws ClassNotFoundException;
}
