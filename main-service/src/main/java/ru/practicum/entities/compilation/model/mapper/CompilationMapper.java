package ru.practicum.entities.compilation.model.mapper;

import ru.practicum.entities.compilation.model.Compilation;
import ru.practicum.entities.compilation.model.dto.CompilationDto;
import ru.practicum.entities.compilation.model.dto.NewCompilationDto;
import ru.practicum.entities.event.model.Event;

import java.util.Set;

public class CompilationMapper {
    public static Compilation newCompilationDtoToCompilation(NewCompilationDto dto, Set<Event> events) {
        return Compilation.builder()
                .title(dto.getTitle())
                .pinned(dto.getPinned() != null ? dto.getPinned() : false)
                .events(events)
                .build();
    }

    public static CompilationDto toCompilationDto(Compilation compilation) {
        return CompilationDto.builder()
                .id(compilation.getId())
                .title(compilation.getTitle())
                .pinned(compilation.getPinned())
                .events(compilation.getEvents().stream().toList())
                .build();
    }
}