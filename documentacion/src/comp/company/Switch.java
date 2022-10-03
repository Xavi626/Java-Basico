package comp.company;

public class Switch {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("El tiempo es Soleado");
                    break;
            case "rainy":
                System.out.println("El tiempo es Lluvioso");
                    break;
            default:
                System.out.println("No se a podido identificar el clima");
                break;
        }
    }
}
