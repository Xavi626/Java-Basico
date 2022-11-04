package Scanner;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws FileNotFoundException {
        boolean ok = false;
        do {
            System.out.println("Mete unos numeros: ");
            try {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
            }catch (InputMismatchException e){
                System.out.println("Numeros Invalidos");
            }

        }while (!ok);
    }
}
