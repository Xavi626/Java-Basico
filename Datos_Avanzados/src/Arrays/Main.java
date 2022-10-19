package Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;
        System.out.println(arrayUno);

        for (int i : arrayUno) {
            System.out.println(i);
        }
/////////////////////////////////////////////////////////////
        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        System.out.println("La longitud de array: " + nombres.length);
//////////////////////////////////////////////////////////////////
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre actual: " + nombres[i]);
///////////////////////////////////////////////////////////////////////////
            String ultimoNombre = "";
            for (i = 0; i < nombres.length; i++) {
                System.out.println("Nombre actual: " + nombres[i] + "en posicion" + i);
                ultimoNombre = nombres[i];
            }
        }
////////////////////////////////////////////////////////////////////////////
        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < arrayBidi[1].length; j++) {

                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }
    }
}
