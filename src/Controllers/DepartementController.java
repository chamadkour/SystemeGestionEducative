package Controllers;
import Services.DataBase;
import Services.DepartmentServices;
import Services.Main;
import Services.EnseignantServices;

import Models.Departement;

public class DepartementController {
        public static void showMenu(){
            System.out.println("Départements : ");


            System.out.println("Choisir 1: Pour ajouter un département");
            System.out.println("Choisir 2: Pour afficher les départements");
            System.out.println("Choisir 3: Pour modifier un département");
            System.out.println("Choisir 4: Pour supprimer un département");
            System.out.println("Choisir 0: Pour retourner au menu principal");

            //Recevoir la valeur
            int option = Main.getIntInput("Veuillez sélectionner une option : ");
            switch(option) {
                case 1:
                    createDepartement();
                    break;
                case 2:
                    displayDepartements();
                    break;
                case 3:
                    editDepartement();
                    break;
                case 4:
                    destroyDepartement();
                    break;
                default:
                    Main.showPrincipalMenu();
            }
        }
        public static void displayDepartements(){
            for (Departement departement : DataBase.departement) {
                System.out.print("Id : " + departement.getId());
                System.out.print(" | Nom Departement : " + departement.getIntitule());
                if (! Main.isNull(departement.getResponsable())) {
                    System.out.print(" | Responsable : " + departement.getResponsable().getNom() + " " + departement.getResponsable().getPrenom());
                }
                System.out.println(" ");
            }

        }
        public static void createDepartement(){
            String intitule = Main.getStringInput("Entrez le nom du departement :");
            EnseignantController.showEnseignants();
            int id = Main.getIntInput("Sélectionnez un enseignant par id :");
            DepartmentServices.addDept(intitule, EnseignantServices.getEnseignantById(id));

            displayDepartements();
            showMenu();


        }
        public static void editDepartement(){
            displayDepartements();
            int id = Main.getIntInput("Sélecionnez un departement par id :");
            String responsable= Main.getStringInput("Entrez le responsable :");
            EnseignantController.showEnseignants();
            int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");

            DepartmentServices.updateDept(id, responsable, EnseignantServices.getEnseignantById(idEns));

            displayDepartements();
            showMenu();
        }
        public static void destroyDepartement(){
            displayDepartements();
            int id = Main.getIntInput("Sélecionnez un departement par id :");
            DepartmentServices.deleteDeptById(id);
            displayDepartements();

}
    }
