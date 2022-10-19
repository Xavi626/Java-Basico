package BigDecimal;
import java.math.BigDecimal;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4);
        valorA.multiply(valorB);
        valorA.add(valorB);
        System.out.println(valorA.toString());
////////////////////////////////////////////////////////////////////
        //Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        //Imprime la suma
        System.out.println(resultado.toString());
    }
}
