package com.felipemoreira.domain;

import com.felipemoreira.domain.validation.ValidationHandler;

public class AggregationRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregationRoot(ID id) {
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {

    }
}
