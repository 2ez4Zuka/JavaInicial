package com;

public class Tema3 {
    public static void main(String[] args) {


        String[] nombres = {"Elder","Jefferson","Livisi","Carbajal"};
        String nombre_concatenado = "";

        for (int i = 0; i < nombres.length; i ++){
            nombre_concatenado = nombre_concatenado + nombres[i];
        }
        System.out.println(nombre_concatenado);
    }
}
