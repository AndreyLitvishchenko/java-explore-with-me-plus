package ru.practicum.entities.category.model.mapper;

import ru.practicum.entities.category.model.Category;
import ru.practicum.entities.category.model.dto.CategoryDto;

public class CategoryMapper {
    public static Category requestToCategory(CategoryDto categoryRequest) {
        return Category.builder()
                .name(categoryRequest.getName())
                .build();
    }

    public static CategoryDto categoryToDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}