package com.example.an.angularExpenseTracker.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseService {

    // In implementation, you'll have to inject the expenseRepository since data is being added to the db here
    // So you create the function called in expenseService, and then write the flow

    @Autowired
    ExpenseRepository expenseRepository;

    // This method fetches all expenses
    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    // This method saves all expenses
    @Override
    public Expense save(Expense expense){
        expenseRepository.save(expense);
        return expense;
    }

    @Override
    public Expense findById(Long id){

        // Get the individual expense by passing the expense id

        if (expenseRepository.findById(id).isPresent()){
            return expenseRepository.findById(id).get();
        }

        return null;
    }


    @Override
    public void delete(Long id){
        Expense expense = findById(id);

        expenseRepository.delete(expense);

    }
}
