package comp.company.interfac;

import comp.company.Coche;
import comp.company.CocheElectrico;
import comp.company.interfac.CochesService;

public class CochesServiceClassicImpl implements CochesService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo Coche");
    }
}
