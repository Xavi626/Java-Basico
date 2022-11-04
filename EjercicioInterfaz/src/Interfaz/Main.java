package Interfaz;

import java.util.List;

public class Main {

    private static CocheCRUD CocheCRUD;

    public static void main(String[] args) {
        CocheCRUD.findAll();
        CocheCRUD.save(new CocheCRUD() {
            @Override
            public void save(Interfaz.CocheCRUD empleado) {

            }

            @Override
            public List<CocheCRUDImpl> findAll() {
                return null;
            }

            @Override
            public void delete(Interfaz.CocheCRUD empleado) {

            }
        });
    }
}