package Services;
import Models.Enseignant;
import Models.Departement;

import java.util.ArrayList;

public class EnseignantServices {
    public static Enseignant addEnseignant(String nom, String prenom, String email, String grade, Departement... departement){
        Enseignant enseignant=new Enseignant();
        enseignant.setNom(nom);
        enseignant.setPrenom(prenom);
        enseignant.setEmail(email);
        enseignant.setGrade(grade);
        enseignant.setId(DataBase.getEnseignant_id());
        if (departement.length > 0){
            Enseignant.setDepartement(departement[0]);
        }
        DataBase.departement.add(departement);
        return  new Enseignant();
    }

    public static Enseignant updateEnseignant(int id, String nom, String prenom, String email, String grade, Departement ...departement){
        for (Enseignant enseignant : DataBase.enseignant) {
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                enseignant.setPrenom(prenom);
                enseignant.setEmail(email);
                enseignant.setGrade(grade);
                if (departement.length> 0){
                    enseignant.setDepartement(departement[0]);
                }
                return enseignant;
            }
        }
        return  new Enseignant();
    }
    public static ArrayList<Enseignant> deleteEnseignantById(int id){
        DataBase.enseignant.remove(getEnseignantById(id));
        return  DataBase.enseignant;
    }

    public static Enseignant getEnseignantById(int id){
        for (Enseignant enseignant : DataBase.enseignant) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEnseignant(){
        return  DataBase.enseignant;
    }
}