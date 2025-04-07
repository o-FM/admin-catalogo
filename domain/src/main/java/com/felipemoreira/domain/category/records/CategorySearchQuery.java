package com.felipemoreira.domain.category.records;

public record CategorySearchQuery(
        int page,
        int perPage,
        String terms,
        String sort,
        String directions
) {
}
