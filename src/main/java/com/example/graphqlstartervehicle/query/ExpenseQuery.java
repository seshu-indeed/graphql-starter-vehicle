package com.example.graphqlstartervehicle.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlstartervehicle.dao.entity.Expense;
import com.example.graphqlstartervehicle.service.ExpenseService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExpenseQuery implements GraphQLQueryResolver {

    private final ExpenseService expenseService;

    public ExpenseQuery(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public List<Expense> getExpenses() {
        return this.expenseService.getAllExpenses();
    }

}