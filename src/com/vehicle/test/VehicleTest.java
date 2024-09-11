package com.vehicle.test;

import com.vehicles.Car;
import com.vehicles.ElectricCar;

public class VehicleTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(120.5);
        car.setFuelLevel(50.0f);
        car.drive(15000);
        System.out.println("Car speed in mph: " + car.getSpeedMph());
        System.out.println("Car distance in kilometers: " + car.getDistanceKm());
        System.out.println("Remaining fuel: " + car.calculateRemainingFuel(15000) + "%");

        ElectricCar electricCar = new ElectricCar();
        electricCar.setSpeed(100.0);
        electricCar.setFuelLevel(80.0f);
        electricCar.setBatteryLevel(90.0);
        electricCar.drive(20000);
        System.out.println("Electric Car speed in mph: " + electricCar.getSpeedMph());
        System.out.println("Electric Car distance in kilometers: " + electricCar.getDistanceKm());
        System.out.println("Remaining fuel: " + electricCar.calculateRemainingFuel(20000) + "%");
        System.out.println("Remaining battery level: " + electricCar.getBatteryLevel() + "%");
    }
}
