package com.ultimatesoftware.banking.transactions.domain.models;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class BankTransaction {
    @Id
    private String id;
    private TransactionType type;
    private UUID account;
    private String customerId;
    private double amount;
    private UUID destinationAccount;
    private TransactionStatus status;

    public BankTransaction() {}

    public BankTransaction(String id, TransactionType type, UUID account, String customerId, double amount, UUID destinationAccount, TransactionStatus status) {
        this.id = id;
        this.type = type;
        this.account = account;
        this.customerId = customerId;
        this.amount = amount;
        this.destinationAccount = destinationAccount;
        this.status = status;
    }

    public BankTransaction(String id, TransactionType type, String customerId, UUID account, double amount, UUID destinationAccount) {
        this.id = id;
        this.type = type;
        this.account = account;
        this.customerId = customerId;
        this.amount = amount;
        this.destinationAccount = destinationAccount;
        this.status = TransactionStatus.IN_PROGRESS;
    }

    public String getId() {
        return id;
    }

    public UUID getDestinationAccount() {
        return destinationAccount;
    }

    public TransactionType getType() {
        return type;
    }

    public UUID getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public static class BankTransactionBuilder {
        private String id;
        private TransactionType type;
        private UUID account;
        private double amount;
        private UUID destinationAccount;
        private String customerId;

        public BankTransactionBuilder setType(TransactionType type) {
            this.type = type;
            return this;
        }

        public BankTransactionBuilder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public BankTransactionBuilder setAccount(UUID account) {
            this.account = account;
            return this;
        }

        public BankTransactionBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public BankTransactionBuilder setDestinationAccount(UUID destinationAccount) {
            this.destinationAccount = destinationAccount;
            return this;
        }

        public BankTransaction build() {
            return new BankTransaction(id, type, customerId, account, amount, destinationAccount);
        }
    }
}
