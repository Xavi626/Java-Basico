package comp.company;

public class CocheMain {
    public static void main(String[] args) {


        String coche = "alfa romeo";



        Coche cocheObj2 = new Coche("Azul","BMW","M5 GTS",2500.32,5.2);


        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 2000.43;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico("amarillo","Renault","ZOE",400.54,2.5,"Motor electico");

        System.out.println(cocheElectrico);

    }
}
