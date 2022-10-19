package comp.company.conInterfaces;

import comp.company.sinInterfaces.Empleado;

public class Main {

    private static EmpleadoCRUD EmpleadoCRUD;

    public static void main(String[] args) {

        EmpleadoCRUD.findAll();
        EmpleadoCRUD.save(new Empleado());
    }
}
