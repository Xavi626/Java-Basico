package comp.company;

public class Funciones {
    public static void main(String[] args) {

        HolaMundo();
        //HolaMundo();
        //HolaMundo("Xavi");
        //HolaMundo("Gallego");
        String hola = devolverHola();
        System.out.println(hola);
    }

    protected static void HolaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static void HolaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static String devolverHola() {
        return "Hola";
    }
}