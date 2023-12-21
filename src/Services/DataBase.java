package Services;
import Models.*;
import Models.Module;

import java.util.ArrayList;

public class DataBase {
    public static int dept_id=0;
    public static int enseignant_id=0;
    public static int etudiant_id=0;
    public static int filiere_id=0;
    public static int module_id=0;
    public static int note_id=0;
    public static ArrayList<Departement> departement = new ArrayList<Departement>();
    public static ArrayList<Enseignant> enseignant = new ArrayList<Enseignant>();
    public static ArrayList<Filiere> filiere = new ArrayList<Filiere>();
    public static ArrayList<Module> module = new ArrayList<Module>();
    public static ArrayList<Etudiant> etudiant = new ArrayList<Etudiant>();
    public static ArrayList<Note> note = new ArrayList<Note>();

    public static int getDept_id(){
        dept_id++;
        return dept_id;
    }
    public static int getEnseignant_id(){
        enseignant_id++;
        return enseignant_id;
    }
    public static int getFiliere_id(){
        filiere_id++;
        return filiere_id;
    }
    public static int getModule_id(){
        module_id++;
        return module_id;
    }
    public static int getEtudiant_id(){
        etudiant_id++;
        return etudiant_id;
    }
    public static int getNote_id(){
        note_id++;
        return note_id;
    }
}
