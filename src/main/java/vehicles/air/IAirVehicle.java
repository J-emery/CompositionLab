package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    public int getWingCount();
    public int getEngineCount();
    public int getSeatCount();
    public void setSeatCount(int seats);
    public void sendMayday();

}
