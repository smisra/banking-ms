package com.ultimatesoftware.banking.events;

import java.util.UUID;

public class AccountCreditedEvent extends AccountTransactionEvent {
    private double balance;
    private double creditAmount;
    private String customerId;

    public AccountCreditedEvent(UUID id, String customerId, double creditAmount, double balance, String transactionId) {
        super(id, transactionId);
        this.balance = balance;
        this.creditAmount = creditAmount;
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public String getCustomerId() {
        return customerId;
    }
}
