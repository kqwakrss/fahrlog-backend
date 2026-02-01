package com.fahrlog.domain.model;

public class Vehicle {
    private VehicleEnum typeVehicle;
    private FuelType fuel;
    private VehicleStatus status;

    public Vehicle(VehicleEnum typeVehicle) {
        this.typeVehicle = typeVehicle;
        this.status = VehicleStatus.NOTBROKEN;
    }
    public VehicleEnum getTypeVehicle() {
        return typeVehicle;
    }
    public FuelType getFuelType(){
        return fuel;
    }
    public VehicleStatus getVehicleStatus() {
        return status;
    }
    public void broken(){
        this.status = VehicleStatus.BROKEN;
    }
    public void notbroken(){
        this.status = VehicleStatus.NOTBROKEN;
    }
}

