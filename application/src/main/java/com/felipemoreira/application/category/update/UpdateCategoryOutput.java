package com.felipemoreira.application.category.update;

import com.felipemoreira.domain.category.entity.Category;
import com.felipemoreira.domain.category.entity.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {
    public static UpdateCategoryOutput from(final Category category) {
        return new UpdateCategoryOutput(category.getId());
    }
}
