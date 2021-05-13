package com.example.graphqlstartervehicle.mutation;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlstartervehicle.dao.entity.Category;
import com.example.graphqlstartervehicle.dao.entity.Expense;
import com.example.graphqlstartervehicle.dao.entity.Vehicle;
import com.example.graphqlstartervehicle.service.ExpenseService;
import com.example.graphqlstartervehicle.service.VehicleService;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

//    private final VehicleService vehicleService;

//    public VehicleMutation(VehicleService vehicleService) {
//        this.vehicleService = vehicleService;
//    }

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

    private final VehicleService vehicleService;
    private final ExpenseService expenseService;

    public VehicleMutation(VehicleService vehicleService, ExpenseService expenseService) {
        this.vehicleService = vehicleService;
        this.expenseService = expenseService;
    }

    public Category createCategory(final String code, final String definition) {
        return this.expenseService.createCategory(code, definition);
    }

    public Expense createExpense(final int amount, final String categoryCode) {
        return this.expenseService.createExpense(amount, categoryCode);
    }
}