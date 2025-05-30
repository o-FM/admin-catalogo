package com.felipemoreira.application.category.create;

import com.felipemoreira.domain.category.entity.Category;
import com.felipemoreira.domain.category.entity.CategoryID;

public record CreateCategoryOutput(CategoryID categoryID) {

    public static CreateCategoryOutput from(final Category category) {
        return new CreateCategoryOutput(category.getId());
    }
}
