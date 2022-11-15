package poo.herencia;

import poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    String color;

    public SmartWatch() {

    }

    public SmartWatch(String model, String brand, double price, String color) {
        super(model, brand, price);
        this.color = color;
    }
}
