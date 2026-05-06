package com.banking.fixes.task4;

public class ReportEntry {

    private String accountId;
    private double amount;

    public ReportEntry() {
        // default constructor
    }

    public ReportEntry(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
