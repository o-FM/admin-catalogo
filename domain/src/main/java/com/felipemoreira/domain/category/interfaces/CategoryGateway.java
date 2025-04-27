package com.felipemoreira.domain.category.interfaces;

import com.felipemoreira.domain.category.entity.Category;
import com.felipemoreira.domain.category.entity.CategoryID;
import com.felipemoreira.domain.category.records.CategorySearchQuery;
import com.felipemoreira.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category category);
    void deleteById(CategoryID id);
    Optional<Category> findById(CategoryID id);
    Category update(Category category);
    Pagination<Category> findAll(CategorySearchQuery searchQuery);
}
