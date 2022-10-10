package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        //Clase identificador = new Clase();

        //Crear un objeto utilizando el constructor vacio

        //crear un objeto utilizando el constructor con paramentros
        Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 190, 220.7,4);

        Vehiculo FordMondeo = new Vehiculo("Ford", "Mondeo",5.2,2001,false,0,motorGTI);

        System.out.println(FordMondeo.fabricante);
        System.out.println(FordMondeo.modelo);
        System.out.println(FordMondeo.cc);
        System.out.println(FordMondeo.año);
        System.out.println(FordMondeo.sport);
        FordMondeo.acelerar(50);
        System.out.println(FordMondeo.velocidad);
        //herencia
        Motocicleta KawasakiNinja = new Motocicleta();
        KawasakiNinja.fabricante = "Kawasaki";
        KawasakiNinja.modelo = "Ninja";
        KawasakiNinja.cc = 1000.00;
        KawasakiNinja.año = 2023;
        KawasakiNinja.sport = true;
        KawasakiNinja.acelerar(300);
        System.out.println(KawasakiNinja.fabricante);
        System.out.println(KawasakiNinja.modelo);
        System.out.println(KawasakiNinja.cc);
        System.out.println(KawasakiNinja.año);
        System.out.println(KawasakiNinja.sport);
        System.out.println(KawasakiNinja.velocidad);
        //Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        //4. Clases abstractas: no se pueden instanciar, solo instancian las clases hijas.
    }
}
