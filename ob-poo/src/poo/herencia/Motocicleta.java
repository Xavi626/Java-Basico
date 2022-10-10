package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
        boolean baul;

        public Motocicleta() {}
        public Motocicleta(String fabricante, String modelo, Double cc, int año, boolean sport, int velocidad, Motor motor, boolean baul) {
                super(fabricante, modelo, cc, año, sport, velocidad, motor);
                this.baul = baul;
        }
}
