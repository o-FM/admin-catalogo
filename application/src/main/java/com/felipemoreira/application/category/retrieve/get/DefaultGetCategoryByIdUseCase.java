package com.felipemoreira.application.category.retrieve.get;

import com.felipemoreira.domain.category.entity.CategoryID;
import com.felipemoreira.domain.category.interfaces.CategoryGateway;
import com.felipemoreira.domain.exceptions.DomainException;
import com.felipemoreira.domain.validation.Error;

import java.util.Objects;
import java.util.function.Supplier;

public class DefaultGetCategoryByIdUseCase extends GetCategoryByIdUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultGetCategoryByIdUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public CategoryOutput execute(final String id) {
        final var aCategoryID = CategoryID.from(id);

        return this.categoryGateway.findById(aCategoryID)
                .map(CategoryOutput::from)
                .orElseThrow(notFound(aCategoryID));
    }

    private Supplier<DomainException> notFound(final CategoryID categoryID) {
        return () -> DomainException.with(
                new Error("Category with ID %s was nout found".formatted(categoryID.getValue()))
        );
    }
}
