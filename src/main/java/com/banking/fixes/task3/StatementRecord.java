package com.banking.fixes.task3;

public class StatementRecord {

    private String recordId;
    private double amount;

    public StatementRecord() {
    }

    public StatementRecord(String recordId, double amount) {
        this.recordId = recordId;
        this.amount = amount;
    }

    public String getRecordId() {
        return recordId;
    }

    public double getAmount() {
        return amount;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
