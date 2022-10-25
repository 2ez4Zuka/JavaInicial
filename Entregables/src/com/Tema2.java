package com;

public class Tema2 {
    public static void main(String[] args) {

        int Price = 500;
        double IVA = 0.18;
        double finalPrice;




        // Llamar a la función:

        double Result = getFinalPrice(Price,IVA);
        System.out.println(Result);


    }

    static double getFinalPrice(int Price, double IVA){
        return Price +  Price*IVA;
    }
}
