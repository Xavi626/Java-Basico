import java.util.ArrayList;
public class ArrayList6 {
    public static void main(String[] args) {
        //Imprime palabras
        ArrayList<Integer> numerous = new ArrayList<Integer>();
        numerous.add(1);
        numerous.add(2);
        numerous.add(3);
        numerous.add(4);
        numerous.add(5);
        numerous.add(6);
        numerous.add(7);
        numerous.add(8);
        numerous.add(9);
        numerous.add(10);
        numerous.add(11);
        for (int i = 0; i < numerous.size(); i++) {
            System.out.println(numerous.get(i));
        }
        System.out.println("\n");
        /////////////////////////////////////////////////////////
        //Borra numeros
        for (int i = 0; i < numerous.size(); i++) {
            Integer aux = (Integer) numerous.get(i);
            if (aux % 2 == 0) {
                numerous.remove(i);
                System.out.println(numerous.get(i));
            }
                }
            }

        }