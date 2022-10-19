package Vectores;

import java.util.Vector;
//LOS VECTORES SON ARRAYS DINAMICOS
public class Vectores_avanzado {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Capacidad: "+ vector.capacity()+ " Tamaño: "+ vector.size());
        vector.trimToSize();//Reduce la capacidad del vector hasta su tamaño (Entonces liberan memoria)
        System.out.println("Capacidad: "+ vector.capacity()+ " Tamaño: "+ vector.size());
    }
}
