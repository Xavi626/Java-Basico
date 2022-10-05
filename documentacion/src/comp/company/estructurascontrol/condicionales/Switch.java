package comp.company.estructurascontrol.condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia = "Viernes";

        switch (dia) {
            case "Lunes":
                System.out.println("UFF que palo lunes");
                break;
            case "Martes":
                System.out.println("Que asco el martes");
                break;
            case "Miercoles":
                System.out.println("Que asco el miercoles");
                break;
            case "Jueves":
                System.out.println("Vamos es jueves");
                break;
                case "Viernes":
                    System.out.println("Es viernes totii");
                break;
            case "Sabado":
                System.out.println("Es sabado jeje");
                break;
            case "Domingo":
                System.out.println("Mañana a trabajar que palo");
                break;
        }
    }
}
