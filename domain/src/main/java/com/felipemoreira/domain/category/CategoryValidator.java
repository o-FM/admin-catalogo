package com.felipemoreira.domain.category;

import com.felipemoreira.domain.validation.Error;
import com.felipemoreira.domain.validation.ValidationHandler;
import com.felipemoreira.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category anCategory, final ValidationHandler handler) {
        super(handler);
        this.category = anCategory;
    }

    @Override
    public void validate() {
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        final var name = this.category.getName();
        if (name == null) {
            this.validationHelper().append(new Error("'name' should not be null"));
            return;
        }

        if (name.isBlank()) {
            this.validationHelper().append(new Error("'name' should not be empty"));
            return;
        }

        final int length = name.trim().length();
        if (length > 255 || length < 3) {
            this.validationHelper().append(new Error("'name' must be between 3 and 255 characters"));
            return;
        }
    }
}
