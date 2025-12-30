package com.example.vehicles.service;

import com.example.vehicles.model.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleServiceTest {

    private VehicleService vehicleService;

    @BeforeEach
    void setUp() {
        vehicleService = new VehicleService();
    }

    @Test
    void shouldAddVehicleWhenDataIsValid() {
        Vehicle vehicle = new Vehicle(
                "Toyota",
                "Camry",
                2020,
                "Sedan"
        );

        Vehicle result = vehicleService.addVehicle(vehicle);

        assertNotNull(result);
        assertEquals("Toyota", result.getBrand());
        assertEquals(1, vehicleService.getAllVehicles().size());
    }

    @Test
    void shouldRejectVehicleWithInvalidYear() {
        Vehicle vehicle = new Vehicle(
                "Ford",
                "Model T",
                1800,
                "Old vehicle"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            vehicleService.addVehicle(vehicle);
        });
    }
}
