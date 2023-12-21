package Services;
import Models.Enseignant;
import Models.Filiere;
import Models.Module;

import java.util.ArrayList;

public class ModuleServices {
    public static Module addFiliere(String intitule, Enseignant responsable,  Filiere filiere) {
        return  new Module();
    }

    public static Module updateFiliere(int id , String intitule, Enseignant chef,  Filiere filiere){
        return  new Module();
    }
    public static ArrayList<Module> deleteModuleById(int id){
        return  DataBase.module;
    }

    public static Module getModuleById(int id){
        return  new Module();
    }

    public static ArrayList<Module> getAllModule(){
        return  DataBase.module;
    }
}
