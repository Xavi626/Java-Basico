package TEMA2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.println("Introduce el precio");
        Integer precio = calculo.nextInt();
        System.out.println("Introduce el IVA");
        Integer iva = calculo.nextInt();
        System.out.println(resultado(precio));
        }
    public static int resultado (Integer precio) {
    int resultado;
    return resultado =precio * 21 /100;
    }
}