package ru.practicum.centralRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.practicum.entities.category.model.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Page<Category> findAll(Pageable pageable);

    default List<Category> findCategories(Integer from, Integer size) {
        Pageable pageable = Pageable.unpaged();
        if (from != null && size != null) {
            pageable = Pageable.ofSize(size).withPage(from / size);
        }
        return findAll(pageable).toList();
    }

    List<Category> findByNameIgnoreCase(String name);
}