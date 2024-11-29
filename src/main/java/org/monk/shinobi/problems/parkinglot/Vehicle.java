package org.monk.shinobi.problems.parkinglot;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public abstract class Vehicle {
    private String vehicleId;
    private VehicleType vehicleType;

    public Vehicle(String vehicleId, VehicleType vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
