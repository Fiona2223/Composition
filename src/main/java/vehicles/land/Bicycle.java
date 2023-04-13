package vehicles.land;

import products.IProduct;
import vehicles.Vehicle;

public class Bicycle  extends Vehicle implements ILandVehicle {

    private int wheelCount;


    public Bicycle(float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.wheelCount =2;
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
