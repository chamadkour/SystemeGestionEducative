package Controllers;
import Models.Enseignant;
import Models.*;
import Services.*;

public class FiliereController {
    public static void showMenu(){
        System.out.println("Filière : ");


        System.out.println("Choisir 1: Pour ajouter une filiere");
        System.out.println("Choisir 2: Pour afficher les filières");
        System.out.println("Choisir 3: Pour modifier une filière");
        System.out.println("Choisir 4: Pour supprimer une filière");
        System.out.println("Choisir 0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createFiliere();
                break;
            case 2:
                showFiliere();
                break;
            case 3:
                editFiliere();
                break;
            case 4:
                destroyFiliere();
                break;
            default:
                Main.showPrincipalMenu();
        }

    }
    public static void showFiliere(){
        for (Filiere filiere : DataBase.filiere) {
            System.out.print("Id : " + filiere.getId());
            System.out.print(" | Intitulé : " + filiere.getIntitule());
            System.out.print(" | Département : " + filiere.getDepartement() );

           if (! Main.isNull(filiere.getResponsable())) {
                System.out.print(" | Chef : " + filiere.getResponsable().getNom() + " " + filiere.getResponsable().getPrenom());
            }
            System.out.println("");
        }
    }
    public static void createFiliere(){
        String intitule = Main.getStringInput("Entrez l'intitulé de la filière : ");
        EnseignantController.showEnseignants();
        int idResp = Main.getIntInput("Sélectionnez le responsable par id :");
        DepartementController.displayDepartements();
        int idDept = Main.getIntInput("Séléctionnez le département ");
        FiliereServices.addFiliere(intitule, EnseignantServices.getEnseignantById(idResp), DepartmentServices.getDepartmentById(idDept));
        showFiliere();

        showMenu();
    }
    public static void editFiliere(){
        showFiliere();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé de la filière :");
        EnseignantController.showEnseignants();
        int idResp = Main.getIntInput("Selectionnez un enseignant : ");
        DepartementController.displayDepartements();
        int idDept = Main.getIntInput("Selectionnez un département : ");
        FiliereServices.updateFiliere(id, intitule, EnseignantServices.getEnseignantById(idResp), DepartmentServices.getDepartmentById(idDept));
        showFiliere();
        showMenu();
    }
    public static void destroyFiliere(){
        showFiliere();
        int id = Main.getIntInput("Selectionnez une filière :");
        FiliereServices.deleteFiliereById(id);
        showFiliere();
    }
}
