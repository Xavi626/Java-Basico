import java.util.Vector;
public class VectorBorrar3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Con todos los elementos "+vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println("Con algunos elementos eliminados "+vector);
    }
}
