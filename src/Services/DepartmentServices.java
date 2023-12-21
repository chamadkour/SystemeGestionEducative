package Services;
import Models.Enseignant;
import Models.Departement;

import java.util.ArrayList;
public class DepartmentServices {
    public static Departement addDept(String intitule, Enseignant ...responsable){
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setId(DataBase.getDept_id());
        if (responsable.length > 0){
            Departement.setResponsable(responsable[0]);
        }
        DataBase.departement.add(departement);

        return  departement;
    }

    public static Departement updateDept(int id , String intitule, Enseignant... responsable){
        for (Departement departement : DataBase.departement) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (responsable.length> 0){
                    departement.setResponsable(responsable[0]);
                }
                return departement;
            }
        }

        return  new Departement();
    }
    public static ArrayList<Departement>  deleteDeptById(int id){
        DataBase.departement.remove(getDepartmentById(id));
        return DataBase.departement;
    }

    public static Departement getDepartmentById(int id){
        for (Departement departement : DataBase.departement) {
            if (departement.getId() == id) return  departement;
        }
        return  new Departement();
    }

    public static ArrayList<Departement> getAllDept(){
        return  DataBase.departement;
    }
}
