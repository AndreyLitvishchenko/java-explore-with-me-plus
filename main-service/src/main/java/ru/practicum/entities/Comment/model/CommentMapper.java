package ru.practicum.entities.Comment.model;

import ru.practicum.entities.event.model.Event;
import ru.practicum.entities.event.model.mapper.EventMapper;
import ru.practicum.entities.user.model.User;
import ru.practicum.entities.user.model.mapper.UserMapper;

import java.time.LocalDateTime;

public class CommentMapper {
    // Преобразование DTO в сущность Comment
    public static Comment toComment(CommentDto commentNewDto, User user, Event event) {
        return Comment.builder()
                .user(user)
                .event(event)
                .message(commentNewDto.getMessage())
                .created(LocalDateTime.now())
                .build();
    }

    // Преобразование сущности Comment в DTO
    public static CommentDto toCommentDto(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .user(UserMapper.toUserDto(comment.getUser()))
                .event(EventMapper.toEventDto(comment.getEvent()))
                .message(comment.getMessage())
                .created(comment.getCreated())
                .build();
    }
}