# Banking Bug Fix Assignment

## Overview

This repository contains fixes for multiple production issues identified in a banking system.
All fixes are implemented with minimal and targeted changes, strictly following the assignment constraints.
No architectural changes or new functionality have been introduced.

---

## Task 1: Overdue Loan Processing (NullPointerException)

**Issue:**

* Result list was not initialized
* Null checks for account and dueDate were missing

**Fix:**

* Initialized result list
* Added null checks to prevent NullPointerException

---

## Task 2: ConcurrentModificationException

**Issue:**

* Collection modified while iterating using enhanced for-loop

**Fix:**

* Replaced loop with Iterator-based removal to ensure safe modification

---

## Task 3: Thread Safety Issue

**Issue:**

* `processedCount++` caused race condition in multi-threaded environment

**Fix:**

* Replaced with `AtomicInteger` for thread-safe increment

---

## Task 4: Connection Leak (JDBC)

**Issue:**

* Connection, PreparedStatement, and ResultSet were not closed

**Fix:**

* Used try-with-resources to ensure proper resource cleanup

---

## Task 5: Exception Handling Improvement

**Issue:**

* Excessive stack trace logging for expected validation failures
* Returning null caused potential NullPointerException
* Missing null checks in batch processing
* Exceptions silently swallowed in batch processing

**Fix:**

* Used SLF4J logger for structured logging
* Differentiated validation errors (`IllegalArgumentException`) from unexpected runtime exceptions
* Avoided returning null by returning a safe default object
* Added null checks to prevent runtime failures
* Ensured exceptions are logged instead of being silently ignored

---

## Tech Stack

* Java
* Collections Framework
* Concurrency (ExecutorService, AtomicInteger)
* JDBC
* SLF4J (Logging)

---

## Key Highlights

* Minimal and surgical fixes applied
* No changes to existing architecture or method signatures
* Proper handling of concurrency, collections, and database resources
* Improved logging and exception handling practices
* All fixes documented using `// FIX:` comments in code

---

## Author

Akash Yadav
