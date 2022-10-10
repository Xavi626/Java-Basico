package Main.clasesHijas;

public class SmartDevice {
    //Atributos

    String Marca;
    String Modelo;
    String Procesador;
    int RAM;
    int Almacenamiento;
    int NumeroPixeles;

    boolean TieneGestos;
    //Constructores
    public SmartDevice(boolean tieneGestos) {
        TieneGestos = tieneGestos;
    }
    public SmartDevice(){}
    public SmartDevice(String marca, String modelo, String procesador, int RAM, int almacenamiento, int numeroPixeles) {
        Marca = marca;
        Modelo = modelo;
        Procesador = procesador;
        this.RAM = RAM;
        Almacenamiento = almacenamiento;
        NumeroPixeles = numeroPixeles;
    }
}
