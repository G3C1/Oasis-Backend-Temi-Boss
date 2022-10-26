package com.g3c1.temiboss.domain.category.domain.repository;


import com.g3c1.temiboss.domain.category.domain.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findCategoryById(Long id);
}
