package com.felipemoreira.application.category.create;

import com.felipemoreira.application.UseCase;
import com.felipemoreira.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
