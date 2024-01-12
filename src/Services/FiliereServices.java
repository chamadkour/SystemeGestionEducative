package Services;
import Models.Filiere;
import Models.Enseignant;
import Models.Departement;

import java.util.ArrayList;

public class FiliereServices {
    public static Filiere addFiliere(String intitule, Departement ... departement) {
        Filiere filiere=new Filiere();
        filiere.setIntitule(intitule);
        filiere.setId(DataBase.getFiliere_id());

        if (departement.length > 0){
            Enseignant.setDepartement(departement[0]);
        }
        DataBase.departement.add(departement);
        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String intitule,  Departement ...departement){
        for (Filiere filiere : DataBase.filiere) {
            if (filiere.getId() == id) {
                filiere.setIntitule(intitule);
                if (departement.length> 0){
                    filiere.setDepartement(departement[0]);
                }
                return departement;
            }
        }
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        DataBase.filiere.remove(getFiliereById(id));
        return  DataBase.filiere;
    }

    public static Filiere getFiliereById(int id){
        for (Filiere filiere : DataBase.filiere) {
            if (filiere.getId() == id) return  filiere;
        }
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  DataBase.filiere;
    }
}
