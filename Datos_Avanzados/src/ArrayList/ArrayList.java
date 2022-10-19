package ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> lista = new java.util.ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        String array[] = new String[lista.size()];
                for (int i = 0; i < lista.size(); i++){
                    array[i] = lista.get(i);
                }
        }
    }