package com.company;

public class Prueba {
    public static void main(String[] args) {
        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";
        String nombre4 = "nombre 4";
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3, nombre4};

        for (int i = 0; i < nombres2.length; i++) {
            System.out.println(nombres2[i]);
        }
    }
}