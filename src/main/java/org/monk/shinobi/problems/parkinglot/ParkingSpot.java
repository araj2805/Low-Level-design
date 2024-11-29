package org.monk.shinobi.problems.parkinglot;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class ParkingSpot {
    private String parkingSpotId;
    private String parkingSpotType;
    private Vehicle vehicle;

    public ParkingSpot(String parkingSpotId, String parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
    }

    void parkVehicle(Vehicle vehicle) {
        if(isAvailable() == true)
            this.vehicle = vehicle;
        else
            throw new RuntimeException("Parking Spot is already filled "+ parkingSpotId);
    }

    boolean isAvailable() {
        return vehicle == null;
    }

    void removeVehicle() {
        this.vehicle = null;
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public String getParkingSpotType() {
        return parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSpotId='" + parkingSpotId + '\'' +
                ", parkingSpotType='" + parkingSpotType + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
