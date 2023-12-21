package Services;
import Models.Etudiant;
import Models.Filiere;

import java.util.ArrayList;
public class EtudiantServices {
    public static Etudiant addEtudiant(String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }

    public static Etudiant updateEtudiant(int id,String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }
    public static ArrayList<Etudiant> deleteEtudiantById(int id){
        return  DataBase.etudiant;
    }

    public static Etudiant getEtudiantById(int id){
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtudiant(){
        return  DataBase.etudiant;
    }
}
