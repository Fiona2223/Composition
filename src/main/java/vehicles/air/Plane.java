package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised {

    private int landingTime;
    private IMotorised engine;
    private Radar radar;

    private Plane (float weight, int maxSpeed, IProduct baseProduct, int landingTime, IMotorised engine, Radar radar) {
        super(weight, maxSpeed, baseProduct);
        this.engine = engine;
        this.landingTime = landingTime;
        this.radar = radar;
    }

    @Override
    public int getLandingTime() {
        return landingTime;
    }

    @Override
    public void setLandingTime(int landingTime) {
        this.landingTime = landingTime;
    }

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }
    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }
}
