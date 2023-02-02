package vehicles.air;

import parts.IPart;
import parts.Radio;
import products.IProduct;
import products.Product;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Glider extends Vehicle implements IAirVehicle {

    private int wingCount;
    private int seatCount;
    private Radio radio;
    private IPart blackBox;
//    private ArrayList<IPart> parts;

    public Glider(float weight, int maxSpeed, IProduct baseProduct, int wingCount, int seatCount){
        super(weight,maxSpeed,baseProduct);
        this.wingCount = wingCount;
        this.seatCount = seatCount;
        this.radio = new Radio("jim's radios", 43, new Product("radio",500,4),10030,"Mati's plane");
    }

    @Override
    public int getWingCount() {
        return this.wingCount;
    }

    @Override
    public int getEngineCount() {
        return 0;
    }

    @Override
    public int getSeatCount() {
        return this.seatCount;
    }

    @Override
    public void setSeatCount(int seats) {
        this.seatCount = seats;
    }

    @Override
    public void sendMayday() {
        radio.sendSOS();
    }
}
