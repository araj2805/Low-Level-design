package org.monk.shinobi.problems.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class ParkingLot {
    private List<Level> levels;
    private Map<Integer, List<ParkingSpot>> parkingSpotMap;

    public ParkingLot(int level) {
        levels = new ArrayList<>();

        for (int i = 0; i < level; i++) {
            levels.add(new Level(i,10));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : levels)
            return level.parkVehicle(vehicle);

        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle) {
        for (Level level : levels)
            return level.unparkVehicle(vehicle);

        return false;
    }



    public void displayAvailableParkingSpot(boolean isSummary) {
        this.parkingSpotMap = levels.stream().collect(Collectors.toMap(Level::getFloor, Level::fetchAvailableParkingSpot));

        //System.out.println(parkingSpotMap);
        if (isSummary) {
            parkingSpotMap.entrySet().stream().forEach(entry -> {
                System.out.println("Level : "+ entry.getKey()+", Available Spots : "+entry.getValue().size());
            });
        } else {
            levels.forEach(Level::displayParkingSpotDetails);
        }

    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "levels=" + levels +
                ", parkingSpotMap=" + parkingSpotMap +
                '}';
    }
}
