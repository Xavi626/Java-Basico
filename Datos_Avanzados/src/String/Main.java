package String;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String cadena = "Mensaje de texto";
        int LongCadena = cadena.length();
        System.out.println("La Lonitud de mi cadena es de: "+LongCadena);

        String cadenaMayus = cadena.toUpperCase(Locale.ROOT);
        System.out.println("La cadena ahora es: "+cadenaMayus);

        String cadenaMinuscula = cadena.toLowerCase(Locale.ROOT);
        System.out.println("La cadena ahota es: "+cadenaMinuscula);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        boolean resultado = cadena.startsWith("Men");

        if (resultado){
            System.out.println("Empieza por lo que estoy buscando");
        }
        else {
            System.out.println("No empieza por donde esta buscando");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        boolean fin = cadena.endsWith("o");
        if (fin){
            System.out.println("Si acaba");
        }else {
            System.out.println("No acaba");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String at = "Mensaje de texto";

        char letra = at.charAt(0);
        System.out.println("Caracter es: "+letra);

        for (int i =0; i < cadena.length(); i++){
            System.out.println("Caracter actual: "+cadena.charAt(i));
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}