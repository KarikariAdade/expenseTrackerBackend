package com.example.an.angularExpenseTracker.expense;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    // This findAll function will be implemented in the ExpenseService Implementation
    // Hence, expense Service becomes an interface
    List<Expense> findAll();

    Expense save(Expense expense);

    Expense findById(Long id);

    void delete(Long id);
}
