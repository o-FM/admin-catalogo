package com.felipemoreira.application.category.update;

import com.felipemoreira.domain.category.entity.Category;
import com.felipemoreira.domain.category.entity.CategoryID;
import com.felipemoreira.domain.category.interfaces.CategoryGateway;
import com.felipemoreira.domain.exceptions.DomainException;
import com.felipemoreira.domain.validation.Error;
import com.felipemoreira.domain.validation.handler.Notification;
import io.vavr.control.Either;

import java.util.function.Supplier;

import static io.vavr.API.Left;
import static io.vavr.API.Try;

public class DefaultUpdateCategoryUseCase extends UpdateCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultUpdateCategoryUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public Either<Notification, UpdateCategoryOutput> execute(final UpdateCategoryCommand command) {
        final var updatedID = CategoryID.from(command.id());
        final var name = command.name();
        final var description = command.description();
        final var isActive = command.isActive();

        final var notification = Notification.create();
        final var category = this.categoryGateway.findById(updatedID).orElseThrow(notFound(updatedID));
        category.update(name, description, isActive)
                .validate(notification);

        return notification.hasError() ? Left(notification) : update(category);
    }

    private Either<Notification, UpdateCategoryOutput> update(final Category category) {
        return Try(() -> this.categoryGateway.update(category))
                .toEither()
                .bimap(Notification::create, UpdateCategoryOutput::from);
    }

    private static Supplier<DomainException> notFound(CategoryID updatedID) {
        return () -> DomainException.with(
                new Error("Category with ID %s was not found".formatted(updatedID.getValue()))
        );
    }
}
