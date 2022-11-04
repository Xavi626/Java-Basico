package InputStream8;

import java.io.*;

public class Main {
    public static void main(String[] args){
            try {
                InputStream fileInt = new FileInputStream("C:\\prueba\\");
                byte[] datos = fileInt.readAllBytes();

                PrintStream fileOut = new PrintStream("Ejercicio.txt");
                fileOut.write(datos);
            }catch (IOException e){
                System.out.println("Excepcion: "+e.getMessage());
            }
    }
    }