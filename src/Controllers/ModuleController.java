package Controllers;
import Models.Module;
import Services.*;

public class ModuleController {
    public static void showMenu(){
        System.out.println("Module : ");


        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createModule();
                break;
            case 2:
                showModule();
                break;
            case 3:
                editModule();
                break;
            case 4:
                destroyModule();
                break;
            default:
                Main.showPrincipalMenu();
        }

    }
    public static void showModule(){
        for ( Module module : DataBase.module) {
            System.out.print("Id : " + module.getId());
            System.out.print(" | Intitulé : " + module.getIntitule());
            System.out.print(" | Filière : " + module.getFiliere());
            System.out.print(" | Professeur : " + module.getProfesseur());
        }
            System.out.println("");
    }
    public static void createModule(){
        int id = Main.getIntInput("Entrez id du module :");
        String intitule = Main.getStringInput("Entrez le nom du module :");
        FiliereController.showFiliere();
        int idFil = Main.getIntInput("Entrez id filière : ");
        EnseignantController.showEnseignants();
        int idEns = Main.getIntInput("Entrez l'enseignant :");


        ModuleServices.addModule(intitule, FiliereServices.getFiliereById(idFil), EnseignantServices.getEnseignantById(idEns));
        showModule();

        showMenu();
    }
    public static void editModule(){
        showModule();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignantController.showEnseignants();
        int idEns = Main.getIntInput("Entrez le professeur :");
        FiliereController.showFiliere();
        int idFil = Main.getIntInput("Entrez l'id de la filière :");

        ModuleServices.updateModule(id, intitule, FiliereServices.getFiliereById(idFil) , EnseignantServices.getEnseignantById(idEns));
        showModule();
        showMenu();
    }
    public static void destroyModule(){
        showModule();
        int id = Main.getIntInput("Selectionnez un module :");
        ModuleServices.deleteModuleById(id);
        showModule();
    }
}
