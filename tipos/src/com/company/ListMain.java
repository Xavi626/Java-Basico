package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        nombres.add("Nombre 5");

        System.out.println(nombres);
        for (String nombre : nombres){
            System.out.println(nombres);
        }
    }
}
