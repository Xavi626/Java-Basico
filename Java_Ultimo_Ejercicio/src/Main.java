import java.io.Console;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

            String sCadena = "Hola Mundo";
            String sCadenaInvertida = "";

            for (int x=sCadena.length()-1;x>=0;x--)
                sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);

            System.out.println(sCadenaInvertida);

        }

    }

