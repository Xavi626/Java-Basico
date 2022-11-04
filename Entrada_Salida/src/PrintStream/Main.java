package PrintStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream
        try{
            InputStream in = new FileInputStream("copia.txt");
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);

        }catch(Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
