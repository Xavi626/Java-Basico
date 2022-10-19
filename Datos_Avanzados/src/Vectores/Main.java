package Vectores;

import java.util.Vector;
//LOS VECTORES SON ARRAYS DINAMICOS
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("datos del vector: "+ vector);


        vector.remove(2);
        System.out.println("Datos del vector: "+ vector);

        System.out.println("Vector tamaño: "+ vector.size() +" y capaciadad: "+vector.capacity());
////////////////////////////////////////////////////////////////////////////////////////////////////////////
for (int i = 0; i < vector.size(); i++){
    if(i % 2 == 0){
        vector.remove(i);
        continue;
    }
    System.out.println("Valor es: "+ vector.get(i) +"en posicion "+ i);
}
    }
}
