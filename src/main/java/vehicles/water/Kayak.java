package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;
import vehicles.water.IWaterVehicle;

public class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;


    public Kayak (float weight, int maxSpeed, IProduct baseProduct, String hullType) {
        super(weight, maxSpeed, baseProduct);

        this.hullType = "carbon fibre";
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
}
