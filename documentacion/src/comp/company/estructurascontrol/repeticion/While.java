package comp.company.estructurascontrol.repeticion;

public class While {
    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10){
            contador++;
            if (contador == 5){
                break;
            }
            System.out.println("Valor del contador: " + contador);
        }
        //Variable nombre esta fuera del ambito del que se creo
        //System.out.println(nombre);
    }
}
