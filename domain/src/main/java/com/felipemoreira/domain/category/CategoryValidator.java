package com.felipemoreira.domain.category;

import com.felipemoreira.domain.validation.Error;
import com.felipemoreira.domain.validation.ValidationHandler;
import com.felipemoreira.domain.validation.Validator;

public class CategoryValidator extends Validator {

    public static final int NAME_MAX_LENGTH = 255;
    public static final int NAME_MIN_LENGTH = 3;
    public static final String NAME_SHOULD_NOT_BE_NULL = "'name' should not be null";
    public static final String NAME_SHOULD_NOT_BE_EMPTY = "'name' should not be empty";
    public static final String NAME_BETWEEN_3_AND_255_CHARACTERS = "'name' must be between 3 and 255 characters";
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
            this.validationHelper().append(new Error(NAME_SHOULD_NOT_BE_NULL));
            return;
        }

        if (name.isBlank()) {
            this.validationHelper().append(new Error(NAME_SHOULD_NOT_BE_EMPTY));
            return;
        }

        final int length = name.trim().length();
        if (length > NAME_MAX_LENGTH || length < NAME_MIN_LENGTH) {
            this.validationHelper().append(new Error(NAME_BETWEEN_3_AND_255_CHARACTERS));
            return;
        }
    }
}
