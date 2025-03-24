package com.felipemoreira.domain.category;

import com.felipemoreira.domain.AggregationRoot;

import java.time.Instant;
import java.util.UUID;

public class Category extends AggregationRoot<CategoryID> {

    private String name;
    private String description;
    private boolean isActive;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(CategoryID id, String name, String description, boolean isActive, Instant createdAt,
                     Instant updatedAt, Instant deletedAt) {
        super(id);
        this.name = name;
        this.description = description;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean aIsActive) {
        final var id = CategoryID.unique();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, aIsActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
