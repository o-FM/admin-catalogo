package com.felipemoreira.application.category.delete;

import com.felipemoreira.domain.category.entity.CategoryID;
import com.felipemoreira.domain.category.interfaces.CategoryGateway;

import java.util.Objects;

public class DefaultDeleCategoryUseCase extends DeleCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultDeleCategoryUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public void execute(final String id) {
        this.categoryGateway.deleteById(CategoryID.from(id));
    }
}
