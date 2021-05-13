package com.example.graphqlstartervehicle.mutation;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlstartervehicle.dao.entity.Vehicle;
import com.example.graphqlstartervehicle.service.VehicleService;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private final VehicleService vehicleService;

    public VehicleMutation(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}