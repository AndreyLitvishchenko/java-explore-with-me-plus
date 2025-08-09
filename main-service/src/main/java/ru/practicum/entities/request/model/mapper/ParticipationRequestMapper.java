package ru.practicum.entities.request.model.mapper;

import ru.practicum.entities.request.model.ParticipationRequest;
import ru.practicum.entities.request.model.dto.ParticipationRequestDto;

public class ParticipationRequestMapper {
    public static ParticipationRequestDto toParticipationRequestDto(ParticipationRequest participationRequest) {
        return ParticipationRequestDto.builder()
                .id(participationRequest.getId())
                .requester(participationRequest.getRequester().getId())
                .event(participationRequest.getEvent().getId())
                .status(participationRequest.getStatus())
                .created(participationRequest.getCreated())
                .build();
    }
}