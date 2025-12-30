package com.example.vehicles.model;

public class Vehicle {

    private String brand;
    private String model;
    private int year;
    private String description;

    public Vehicle(String brand, String model, int year, String description) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
