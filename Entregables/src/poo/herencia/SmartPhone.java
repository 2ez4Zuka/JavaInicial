package poo.herencia;

import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    int batteryDuration;

    public SmartPhone(){

    }

    public SmartPhone(String model, String brand, double price, int batteryDuration) {
        super(model, brand, price);
        this.batteryDuration = batteryDuration;
    }
}
