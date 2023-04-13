package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;
import vehicles.water.IWaterVehicle;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised motor;

    public Speedboat (float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight, maxSpeed, baseProduct);

        this.hullType = "steel";
        this.motor = motor;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public IMotorised getMotor() {
        return motor;
    }

    public void setMotor(IMotorised motor) {
        this.motor = motor;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started and go for a ride");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped and anchor the boat");
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
}
