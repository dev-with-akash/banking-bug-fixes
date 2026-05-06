# Banking Bug Fix Assignment

## Overview
This repository contains fixes for multiple production issues identified in a banking system.  
All fixes are implemented with minimal and targeted changes, strictly following the assignment constraints.

---

## Task 1: Overdue Loan Processing (NullPointerException)

**Issue:**
- Result list was not initialized
- Null checks for account and dueDate were missing

**Fix:**
- Initialized result list
- Added null checks to prevent NullPointerException

---

## Task 2: ConcurrentModificationException

**Issue:**
- Collection modified while iterating using enhanced for-loop

**Fix:**
- Replaced loop with Iterator-based removal to ensure safe modification

---

## Task 3: Thread Safety Issue

**Issue:**
- `processedCount++` caused race condition in multi-threaded environment

**Fix:**
- Replaced with `AtomicInteger` for thread-safe increment

---

## Task 4: Connection Leak (JDBC)

**Issue:**
- Connection, PreparedStatement, and ResultSet were not closed

**Fix:**
- Used try-with-resources to ensure proper resource cleanup

---

## Tech Stack
- Java
- Collections Framework
- Concurrency (ExecutorService, AtomicInteger)
- JDBC

---

## Key Highlights
- Minimal and surgical fixes applied
- No changes to existing architecture or method signatures
- All fixes documented using `// FIX:` comments in code

---

## Author
Akash Yadav
