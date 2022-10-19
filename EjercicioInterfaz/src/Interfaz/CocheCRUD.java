package Interfaz;

import java.util.List;

public interface CocheCRUD {


        void save(CocheCRUD CocheCRUD);

        List<CocheCRUDImpl> findAll();

        void delete(CocheCRUD empleado);

}
