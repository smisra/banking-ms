package com.ultimatesoftware.banking.events;

import java.util.UUID;

public abstract class AccountEvent {
    protected UUID id;

    public AccountEvent(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
