package ArrayList;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");
        System.out.println("contenido: " + lista);

        for (String nombre : lista){
            System.out.println(nombre);
        }

        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
