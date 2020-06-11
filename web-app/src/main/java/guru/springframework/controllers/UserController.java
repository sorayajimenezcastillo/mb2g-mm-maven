package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import guru.springframework.mappers.UserMapper;

public class UserController {
    User saveUser(UserCommand command) {
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
