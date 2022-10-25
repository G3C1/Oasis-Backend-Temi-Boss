package com.g3c1.temiboss.domain.category.domain.repository;


import com.g3c1.temiboss.domain.category.domain.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
