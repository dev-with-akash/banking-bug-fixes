package com.banking.fixes.task1;

import java.util.*;

public class OverdueLoanService {

    public List<LoanAccount> getOverdueLoans(List<LoanAccount> accounts) {

        // FIX: Initialize result list to avoid NullPointerException
        List<LoanAccount> result = new ArrayList<>();

        // FIX: Handle null input list
        if (accounts == null) {
            return result;
        }

        Date today = new Date();

        for (LoanAccount account : accounts) {

            // FIX: Added null checks for account and dueDate to prevent NPE
            if (account != null && account.getDueDate() != null
                    && account.getDueDate().before(today)) {

                // Existing logic preserved
                if (account.getOutstandingBalance() > 0) {
                    result.add(account);
                }
            }
        }

        return result;
    }
}