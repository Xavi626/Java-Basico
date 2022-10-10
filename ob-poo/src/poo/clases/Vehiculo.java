package poo.clases;

public class Vehiculo{

    // 1.Atributos
    protected String fabricante;
    protected String modelo;
    protected Double cc;
    protected int año;
    protected boolean sport;

    protected int velocidad;

    protected Motor motor;

    public Vehiculo(String fabricante, String modelo, Double cc, int año, boolean sport, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.año = año;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    //2. Constructores
    public Vehiculo() {

    }
public Vehiculo(String ford, String mondeo, double v, int i, int b, Motor GTI){

}
public Vehiculo(String fabricante, String modelo, double cc, int año, boolean sport){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.cc = cc;
    this.año = año;
    this.sport = sport;

}



    //3.Metodos(comportamiento)
    public void acelerar(int cantidad){

        this.velocidad += cantidad;
    }
}
