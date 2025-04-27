package com.felipemoreira.application.category.retrieve.list;

import com.felipemoreira.application.UseCase;
import com.felipemoreira.domain.category.records.CategorySearchQuery;
import com.felipemoreira.domain.pagination.Pagination;

public abstract class ListCategoryUseCase extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}
