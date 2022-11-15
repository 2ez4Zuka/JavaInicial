package poo.clases;
import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartDevice Iphone = new SmartDevice("12 Max","Iphone",3000.5);
        System.out.println(Iphone.model);
        System.out.println(Iphone.brand);
        System.out.println(Iphone.price);

        // Herencias:

        SmartPhone Android = new SmartPhone();
        Android.brand = "LG";
        Android.model = "K42";
        Android.price = 1500.5;

        System.out.println("El SmartPhone "+Android.brand+" del modelo "+Android.model+" tiene un valor de: "+Android.price);

        SmartWatch AppleWatch = new SmartWatch();
        AppleWatch.brand = "Iphone";
        AppleWatch.model = "S3";
        AppleWatch.price = 650;

        System.out.println("El SmartWatch "+AppleWatch.brand+" del modelo "+AppleWatch.model+" tiene un valor de: "+AppleWatch.price);






    }

}
