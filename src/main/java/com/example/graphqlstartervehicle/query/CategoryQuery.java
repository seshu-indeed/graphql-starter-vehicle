package com.example.graphqlstartervehicle.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlstartervehicle.dao.entity.Category;
import com.example.graphqlstartervehicle.service.ExpenseService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryQuery implements GraphQLQueryResolver {

    private final ExpenseService expenseService;

    public CategoryQuery(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public List<Category> getCategories() {
        return this.expenseService.getAllCategories();
    }

}