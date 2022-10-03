package comp.company.interfac;

import comp.company.Coche;
import comp.company.CocheElectrico;
import comp.company.interfac.CochesService;

public class CochesServiceSportImpl implements CochesService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
