package com.example.an.angularExpenseTracker.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*") // CORS
@RestController
@RequestMapping("api/v1")

public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>> get() {

        // An array has been assigned to the function findAll in expenseService;

        List<Expense> expenses = expenseService.findAll();

        // Response entity will return response in json

        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }


    // This posts data to the expense table

    @PostMapping("/expenses/post")
    public ResponseEntity<Expense> save(@RequestBody Expense expense){
        // This function triggers the save function in expense service
        // and adds the expense as parameter

        Expense expenseOne = expenseService.save(expense);
        return new ResponseEntity<>(expenseOne, HttpStatus.OK);
    }

}
