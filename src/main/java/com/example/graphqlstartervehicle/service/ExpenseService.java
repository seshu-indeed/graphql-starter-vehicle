package com.example.graphqlstartervehicle.service;

import com.example.graphqlstartervehicle.dao.entity.Category;
import com.example.graphqlstartervehicle.dao.entity.Expense;
import com.example.graphqlstartervehicle.dao.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(final ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Category createCategory(String code, String definition) {
        Category category = Category.builder().code(code).definition(definition).build();
        return this.expenseRepository.createCategory(category);
    }

    public Expense createExpense(int amount, String code) {
        Optional<Category> category = expenseRepository.findCategoryByCode(code);
        if (!category.isPresent()) {
            throw new RuntimeException("Unable to find Category with code '" + code + "'. Cannot create expense for amount mentioned (" + amount + ")");
        }

        Expense expense = Expense.builder().amount(amount).category(category.get()).build();
        return this.expenseRepository.createExpense(expense);
    }

    public List<Expense> getAllExpenses() {
        return this.expenseRepository.getAllExpenses();
    }

    public List<Category> getAllCategories() {
        return this.expenseRepository.getAllCategories();
    }

}