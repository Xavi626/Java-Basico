package Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mete dos enteros :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean ok = false;
        System.out.println("Enteros son: "+ a +" "+ b);
        do {
            System.out.println("Mete unos numeros: ");
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                ok = true;
            }catch (InputMismatchException e){
                System.out.println("Numeros Invalidos");
            }

        }while (!ok);
    }
}
