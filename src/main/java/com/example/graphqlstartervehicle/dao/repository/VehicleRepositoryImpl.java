package com.example.graphqlstartervehicle.dao.repository;

import com.example.graphqlstartervehicle.dao.entity.Vehicle;
import com.google.common.collect.Lists;
import lombok.Synchronized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class VehicleRepositoryImpl implements VehicleRepository {
    private int id = 0;

    Map<Integer, Vehicle> store;

    @Autowired
    public VehicleRepositoryImpl() {
        store = new HashMap<>();
    }

    @Override
    @Synchronized
    public Vehicle save(Vehicle vehicle) {
        vehicle.setId(id++);
        store.put(vehicle.getId(), vehicle);
        return vehicle;
    }

    @Override
    public List<Vehicle> findAll() {
        return Lists.newArrayList(store.values());
    }

    @Override
    public Optional<Vehicle> findById(int id) {
        return Optional.ofNullable(store.get(id));
    }

}