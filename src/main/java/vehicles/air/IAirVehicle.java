package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    int getLandingTime();
    void setLandingTime(int landingTime);
}
