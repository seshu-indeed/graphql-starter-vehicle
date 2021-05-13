package com.example.graphqlstartervehicle.dao.repository;

import com.example.graphqlstartervehicle.dao.entity.Action;
import com.example.graphqlstartervehicle.dao.entity.ActionType;
import com.example.graphqlstartervehicle.dao.entity.Category;
import com.example.graphqlstartervehicle.dao.entity.Expense;
import lombok.Synchronized;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ExpenseRepositoryImplInMemory implements ExpenseRepository {

    private List<Expense> expenses = new ArrayList<>();
    private static long nextExpenseId=1;

    private List<Category> categories = new ArrayList<>();
    private static long nextCategoryId=1;

    @Override
    @Synchronized
    public Expense createExpense(Expense expense) {
        expense.setId(nextExpenseId++);
        expense.addAction(Action.builder().type(ActionType.CREATE).build());

        expenses.add(expense);
        return expense;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    @Override
    @Synchronized
    public Category createCategory(Category category) {
        category.setId(nextCategoryId++);
        category.addAction(Action.builder().type(ActionType.CREATE).build());

        categories.add(category);
        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Optional<Category> findCategoryByCode(String code) {
        return getAllCategories().stream().filter(category -> category.getCode().equalsIgnoreCase(code)).findFirst();
    }

}