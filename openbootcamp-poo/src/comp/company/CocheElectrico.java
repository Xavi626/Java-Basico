package comp.company;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String MotorElectrico) {
        this.motorElectrico = MotorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String MotorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = MotorElectrico;
    }
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}