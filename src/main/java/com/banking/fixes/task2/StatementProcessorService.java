package com.banking.fixes.task2;

import java.util.*;

public class StatementProcessorService {

    public void filterTransactions(List<Transaction> transactions) {

        // FIX: Use iterator to safely remove elements during iteration
        Iterator<Transaction> iterator = transactions.iterator();

        while (iterator.hasNext()) {
            Transaction txn = iterator.next();

            if (shouldRemove(txn)) {
                iterator.remove(); // FIX: avoids ConcurrentModificationException
            }
        }
    }

    private boolean shouldRemove(Transaction txn) {
        return false; // placeholder (existing logic assumed)
    }
}
