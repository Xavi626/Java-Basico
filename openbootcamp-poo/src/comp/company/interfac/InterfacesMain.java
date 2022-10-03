package comp.company.interfac;

import comp.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {


        CochesService service1 = new CochesServiceClassicImpl();
        CochesService service2 = new CochesServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();



    }
}
