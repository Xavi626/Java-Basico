package Main.clasesHijas;

import Main.clasesHijas.SmartPhone;
import Main.clasesHijas.SmartWatch;

public class Main {

    public  Main(){

    }
        public static void main(String[] args) {
            SmartDevice Mobil = new SmartDevice("Apple","Iphone","M1Pro",8,1000,50);
            System.out.println("EL MOBIL");
            System.out.println("");
            System.out.println("La marca es "+Mobil.Marca);
            System.out.println("El modelo es "+Mobil.Modelo);
            System.out.println("El procesador es "+Mobil.Procesador);
            System.out.println("Tiene "+Mobil.RAM+" GB de RAM");
            System.out.println("Tiene "+Mobil.Almacenamiento+" GB de Almacenamiento");
            System.out.println("La camara tiene "+Mobil.NumeroPixeles+" px");
            System.out.println("Tiene gestos? "+Mobil.TieneGestos);

            System.out.println("\n");
            SmartDevice Reloj = new SmartDevice("Apple","Watch","M2PRO",4,128,23);
            System.out.println("EL RELOJ");
            System.out.println("");
            System.out.println("La marca es "+Reloj.Marca);
            System.out.println("El modelo es "+Reloj.Modelo);
            System.out.println("El procesador es "+Reloj.Procesador);
            System.out.println("Tiene "+Reloj.RAM+" GB de RAM");
            System.out.println("Tiene "+Reloj.Almacenamiento+" GB de Almacenamiento");
            System.out.println("La camara tiene "+Reloj.NumeroPixeles+" px");
            Reloj.TieneGestos= true;
            System.out.println("Tiene gestos? "+Reloj.TieneGestos);
        }
}