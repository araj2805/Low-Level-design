package org.monk.shinobi.problems.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class Level {
    private int floor;
    private int capacity;
    private List<ParkingSpot> parkingSpotList;

    private int fourWheelerMotorVehicleCapacity;
    private int twoWheelerMotorVehicleCapacity;
    private int heavyMotorVehicleCapacity;


    //Assuming 50% -> FourWheeler Motor Vehicle, 30% -> MotorCycle, 20% -> Heavy Vehicle

    public Level(int floor, int capacity) {
        this.floor = floor;
        this.capacity = capacity;
        parkingSpotList = new ArrayList<>();

        this.fourWheelerMotorVehicleCapacity = (int)Math.floor(capacity*(0.5));
        this.twoWheelerMotorVehicleCapacity = (int)Math.floor(capacity*(0.3));
        this.heavyMotorVehicleCapacity = (int)Math.floor(capacity*(0.2));

        for (int i = 0; i < fourWheelerMotorVehicleCapacity; i++){
            parkingSpotList.add(new ParkingSpot(new StringBuffer().append((char) (floor+'A')).append("_").append(i + 1).toString(),VehicleType.FOUR_WHEELER.name()));
        }

        IntStream.range(0,twoWheelerMotorVehicleCapacity).forEach(i -> parkingSpotList.add(new ParkingSpot(new StringBuffer().append((char) (floor+'A')).append("_").append(i + 1).toString(),VehicleType.TWO_WHEELER.name())));
        IntStream.range(0,heavyMotorVehicleCapacity).forEach(i -> parkingSpotList.add(new ParkingSpot(new StringBuffer().append((char) (floor+'A')).append("_").append(i + 1).toString(),VehicleType.HEAVY_WHEELER.name())));
    }

    public List<ParkingSpot> fetchAvailableParkingSpot() {
        return parkingSpotList.stream().filter(ParkingSpot::isAvailable).collect(Collectors.toList());
    }

    public boolean parkVehicle(Vehicle vehicle) {

        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isAvailable() && parkingSpot.getParkingSpotType().equalsIgnoreCase(vehicle.getVehicleType().name())) {
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }

        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {

        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isAvailable() == false && parkingSpot.getVehicle().getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())) {
                parkingSpot.removeVehicle();
                return true;
            }
        }
        return false;
    }

    public void displayParkingSpotDetails () {
        System.out.println("Level : "+floor);
        parkingSpotList.forEach(spot -> {
            System.out.println("Spot " + spot.getParkingSpotId() + ": " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getParkingSpotType());
        });
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFourWheelerMotorVehicleCapacity() {
        return fourWheelerMotorVehicleCapacity;
    }

    public int getTwoWheelerMotorVehicleCapacity() {
        return twoWheelerMotorVehicleCapacity;
    }

    public int getHeavyMotorVehicleCapacity() {
        return heavyMotorVehicleCapacity;
    }


    @Override
    public String toString() {
        return "Level{" +
                "floor=" + floor +
                ", capacity=" + capacity +
                ", parkingSpotList=" + parkingSpotList +
                ", fourWheelerMotorVehicleCapacity=" + fourWheelerMotorVehicleCapacity +
                ", twoWheelerMotorVehicleCapacity=" + twoWheelerMotorVehicleCapacity +
                ", heavyMotorVehicleCapacity=" + heavyMotorVehicleCapacity +
                '}';
    }
}
