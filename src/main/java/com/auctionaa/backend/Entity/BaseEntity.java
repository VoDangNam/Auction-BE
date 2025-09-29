package com.auctionaa.backend.Entity;

import org.springframework.data.annotation.Id;

public abstract class BaseEntity {
    @Id
    protected String id;

    public String getId() {
        return id;
    }

    public abstract String getPrefix();

    public void generateId() {
        this.id = getPrefix() + System.nanoTime();
    }
}
