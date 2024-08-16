package com.a;

public class BikeFactory implements VehicleFactory {
	public Vehicle createVehicle() {
        return new Bike();
    }
}