package Services;
import Models.Enseignant;
import Models.Etudiant;
import Models.Filiere;

import java.util.ArrayList;
public class EtudiantServices {
    public static Etudiant addEtudiant(String nom, String prenom, String email, int apogee, Filiere... filiere){
        Etudiant etudiant=new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setApogee(apogee);
        etudiant.setId(DataBase.getEnseignant_id());
        if (filiere.length > 0){
            Etudiant.setFiliere(filiere[0]);
        }
        DataBase.filiere.add(filiere);
        return  new Etudiant();
    }

    public static Etudiant updateEtudiant(int id,String nom, String prenom, String email, int apogee, Filiere...filiere){
        for (Etudiant etudiant : DataBase.etudiant) {
            if (etudiant.getId() == id) {
                etudiant.setNom(nom);
                etudiant.setPrenom(prenom);
                etudiant.setEmail(email);
                etudiant.setApogee(apogee);
                if (filiere.length > 0){
                    Etudiant.setFiliere(filiere[0]);
                }
                return etudiant;
            }
        }
        return  new Etudiant();
    }
    public static ArrayList<Etudiant> deleteEtudiantById(int id){
        DataBase.etudiant.remove(getEtudiantById(id));
        return  DataBase.etudiant;
    }

    public static Etudiant getEtudiantById(int id){
        for (Etudiant etudiant : DataBase.etudiant) {
            if (etudiant.getId() == id) return  etudiant;
        }
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtudiant(){
        return  DataBase.etudiant;
    }
}
