package Services;
import Models.Departement;
import Models.Enseignant;
import Models.Filiere;
import Models.Module;

import java.util.ArrayList;

public class ModuleServices {
    public static java.lang.Module addModule(String intitule,Filiere filiere, Enseignant... professeur) {
        Module module = new Module();
        module.setIntitule(intitule);
        module.setId(DataBase.getModule_id());
        if (professeur.length > 0){
            Module.setProfesseur(professeur[0]);
        }
        DataBase.enseignant.add(professeur);

        return  new java.lang.Module();
    }

    public static java.lang.Module updateModule(int id , String intitule, Enseignant professeur, Filiere filiere) {
        for (Module module : DataBase.module) {
            if (module.getId() == id) {
                module.setIntitule(intitule);
                if (filiere.length > 0) {
                    Module.setProfesseur(professeur[0]);
                }
                return module;
            }
            return new java.lang.Module();
        }
    }

        public static java.lang.Module getModuleById ( int id){
            for (Module module : DataBase.module) {
                if (module.getId() == id) return module;
            }
            return new Module();
            return new java.lang.Module();
        }
        public static ArrayList<java.lang.Module> deleteModuleById ( int id){
            DataBase.module.remove(getModuleById(id));
            return DataBase.module;
        }

        public static ArrayList<Module> getAllModule () {
            return DataBase.module;
        }
    }