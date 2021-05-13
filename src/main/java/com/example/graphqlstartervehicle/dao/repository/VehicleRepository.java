package com.example.graphqlstartervehicle.dao.repository;

import com.example.graphqlstartervehicle.dao.entity.Vehicle;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface VehicleRepository {

    Vehicle save(Vehicle vehicle);

    List<Vehicle> findAll();

    Optional<Vehicle> findById(int id);

}