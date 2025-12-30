package com.example.vehicles.service;

import com.example.vehicles.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public Vehicle addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }

        if (vehicle.getBrand() == null || vehicle.getBrand().trim().isEmpty()) {
            throw new IllegalArgumentException("Brand is required");
        }

        if (vehicle.getModel() == null || vehicle.getModel().trim().isEmpty()) {
            throw new IllegalArgumentException("Model is required");
        }

        if (vehicle.getYear() < 1900) {
            throw new IllegalArgumentException("Year must be >= 1900");
        }

        vehicles.add(vehicle);
        return vehicle;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }
}
