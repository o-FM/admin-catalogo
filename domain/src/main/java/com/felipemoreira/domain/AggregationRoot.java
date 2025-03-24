package com.felipemoreira.domain;

public class AggregationRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregationRoot(ID id) {
        super(id);
    }
}
