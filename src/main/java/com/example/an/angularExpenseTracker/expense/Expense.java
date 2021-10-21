package com.example.an.angularExpenseTracker.expense;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Table
@Entity
@Setter
@Getter
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expense;

    private String description;

    private BigDecimal amount;


}
