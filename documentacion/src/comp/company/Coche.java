package comp.company;

public class Coche {
    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad;

    //constructores
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
    this.color = color;
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.peso=peso;
    this.largo=largo;
    }
    //comportamiento
    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <=120){
            this.velocidad += cantidad;
        }

}
}
