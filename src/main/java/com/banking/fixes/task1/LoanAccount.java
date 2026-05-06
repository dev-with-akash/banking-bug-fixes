package com.banking.fixes.task1;

import java.util.*;

public class LoanAccount {

    private Date dueDate;
    private double outstandingBalance;
    private String accountId;

    public LoanAccount(Date dueDate, double outstandingBalance, String accountId) {
        this.dueDate = dueDate;
        this.outstandingBalance = outstandingBalance;
        this.accountId = accountId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public String getAccountId() {
        return accountId;
    }
}
