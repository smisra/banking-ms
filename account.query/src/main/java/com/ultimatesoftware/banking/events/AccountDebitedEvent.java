package com.ultimatesoftware.banking.events;

import java.util.UUID;

public class AccountDebitedEvent extends AccountTransactionEvent {
    private double balance;
    private double debitAmount;
    private String customerId;

    public AccountDebitedEvent(UUID id, String customerId, double debitAmount, double balance, String transactionId) {
        super(id, transactionId);
        this.balance = balance;
        this.debitAmount = debitAmount;
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
