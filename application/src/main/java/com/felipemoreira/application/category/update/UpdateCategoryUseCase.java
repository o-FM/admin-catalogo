package com.felipemoreira.application.category.update;

import com.felipemoreira.application.UseCase;
import com.felipemoreira.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase extends UseCase<UpdateCategoryCommand, Either<Notification,
        UpdateCategoryOutput>> {
}
