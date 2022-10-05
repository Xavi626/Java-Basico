package comp.company.estructurascontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {
        String dia = "Lunkes";

        //ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        //if else if

        if (dia.equals("Lunes")) {

            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {

            System.out.println("Martes con M de mierda");

        } else if (dia.equals("Miercoles")) {

            System.out.println("Miercoles con M de mierda");

        } else if (dia.equals("Jueves")) {

            System.out.println("Ya es Jueves");

        } else if (dia.equals("Viernes")) {

            System.out.println("Nos fuimos");

        } else if (dia.equals("Sabado")) {

            System.out.println("WIIIII");

        } else if (dia.equals("Domingo")) {

            System.out.println("Depresion");
        } else {
            System.out.println("ERROR");
        }


    }
}
