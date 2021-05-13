package com.example.graphqlstartervehicle.dao.repository;

import com.example.graphqlstartervehicle.dao.entity.Category;
import com.example.graphqlstartervehicle.dao.entity.Expense;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ExpenseRepository {

    Expense createExpense(Expense expense);

    List<Expense> getAllExpenses();

    Category createCategory(Category category);

    List<Category> getAllCategories();

    Optional<Category> findCategoryByCode(String code);

}