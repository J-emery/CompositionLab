package vehicles.sea;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class SpeedBoat extends Vehicle implements IMotorised, IWaterVehicle{
    private String hullType;
    private IMotorised motor;

    public SpeedBoat (float weight, int maxSpeed, IProduct baseProduct, IMotorised motor, String hullType){
        super(weight,maxSpeed,baseProduct);
        this.motor = motor;
        this.hullType = hullType;
    }

    @Override
    public void startEngine() {
        motor.startEngine();
    }

    @Override
    public void stopEngine() {
        motor.stopEngine();
    }

    @Override
    public int getHp() {
        return motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        motor.setFuel(fuel);
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = type;
    }
}
