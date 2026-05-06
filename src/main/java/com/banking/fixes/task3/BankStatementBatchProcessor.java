package com.banking.fixes.task3;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BankStatementBatchProcessor {

    // FIX: Replaced int with AtomicInteger to ensure thread-safe updates
    // processedCount++ is not atomic (read-modify-write), causing race conditions
    private AtomicInteger processedCount = new AtomicInteger(0);

    public void process(List<StatementRecord> records) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (StatementRecord record : records) {
            executor.submit(() -> {
                processRecord(record);

                // FIX: Atomic increment prevents lost updates in concurrent execution
                processedCount.incrementAndGet();
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.MINUTES);
    }

    public int getProcessedCount() {
        return processedCount.get(); // FIX: safe retrieval
    }

    private void processRecord(StatementRecord record) {
        // existing logic
    }
}
