package org.monk.shinobi.problems.parkinglot;

/**
 * Copyright (c) 2024.
 *
 * @author Ankit Raj
 */

public class ParkingLotDriver {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(2);


        Vehicle car = new Car("ABC123",VehicleType.FOUR_WHEELER);
        Vehicle truck = new Truck("XYZ789",VehicleType.HEAVY_WHEELER);
        Vehicle motorcycle = new Bike("M1234",VehicleType.TWO_WHEELER);

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailableParkingSpot(true);
        //parkingLot.displayAvailableParkingSpot(false);

        // Unpark vehicle
        parkingLot.unParkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailableParkingSpot(true);
       // parkingLot.displayAvailableParkingSpot(false);
    }
}
