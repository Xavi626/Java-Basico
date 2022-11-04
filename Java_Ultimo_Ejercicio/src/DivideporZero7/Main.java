package DivideporZero7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Introduce un numero");
        Scanner teclado = new Scanner(System.in);
        while (teclado.hasNext()) {
            Integer resultado = Integer.valueOf(teclado.nextLine());
        if(resultado == 0){

            throw new ArithmeticException("Esto no se puede hacer");
        }
        }
        }
    }
