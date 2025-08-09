package ru.practicum.entities.user.model.mapper;

import ru.practicum.entities.user.model.User;
import ru.practicum.entities.user.model.dto.UserDto;

public class UserMapper {
    public static User toUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .name(userDto.getName())
                .build();
    }

    public static UserDto toUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .build();
    }
}