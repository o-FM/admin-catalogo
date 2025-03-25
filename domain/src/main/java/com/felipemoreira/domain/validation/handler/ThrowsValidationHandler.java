package com.felipemoreira.domain.validation.handler;

import com.felipemoreira.domain.exceptions.DomainException;
import com.felipemoreira.domain.validation.Error;
import com.felipemoreira.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(List.of(anError));
    }

    @Override
    public ValidationHandler append(final ValidationHandler anHandler) {
        throw DomainException.with(List.of(anHandler.getErrors().get(0)));
    }

    @Override
    public ValidationHandler validate(final Validation anValidation) {
        try {
            anValidation.validate();
        } catch (final Exception e) {
            throw DomainException.with(List.of(new Error(e.getMessage())));
        }

        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}
