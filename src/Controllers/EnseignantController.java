package Controllers;
import Services.*;
import Models.*;


public class EnseignantController {

        public static void showMenu(){
            System.out.println("Enseignant : ");


            System.out.println("1: Pour ajouter un enseignant");
            System.out.println("2: Pour afficher les enseignants");
            System.out.println("3: Pour modifier un enseignant");
            System.out.println("4: Pour supprimer un enseignant");
            System.out.println("0: Pour retourner au menu principal");

            //"Veuillez sélectionner une option : ")
            int option = Main.getIntInput("Veuillez sélectionner une option : ");
            switch(option) {
                case 1:
                    createEnseignant();
                    break;
                case 2:
                    showEnseignants();
                    break;
                case 3:
                    editEnseignant();
                    break;
                case 4:
                    destroyEnseignant();
                    break;
                default:
                    Main.showPrincipalMenu();
            }

        }
        public static void showEnseignants(){
            for (Enseignant enseignant : DataBase.enseignant) {
                System.out.print("Id : " + enseignant.getId());
                System.out.print(" | Nom : " + enseignant.getNom() + " " + enseignant.getPrenom());
                System.out.print(" | Email : " + enseignant.getEmail() );

            }
        }
        public static void createEnseignant(){
            String nom = Main.getStringInput("Entrez le nom de l'enseignant :");
            String prenom = Main.getStringInput("Entrez le prénom de l'enseignant :");
            String email = Main.getStringInput("Entrez l'email de l'enseignat :");
            String grade = Main.getStringInput("Entrez grade de l'enseignant : ");
            int id = Main.getIntInput("Entrez id :");
            EnseignantServices.addEnseignant(nom, prenom, email, grade, DepartmentServices.getDepartmentById(id));
            showEnseignants();

            showMenu();
        }
        public static void editEnseignant(){
            showEnseignants();
            int id = Main.getIntInput("Sélecionnez un enseignant par id :");
            String nom = Main.getStringInput("Entrez le nom :");
            String prenom = Main.getStringInput("Entrez le prénom :");
            String email = Main.getStringInput("Entrez l'email :");
            String grade = Main.getStringInput("Entrez le grade :");
            DepartementController.displayDepartements();
            int idDept = Main.getIntInput("Selectionnez un departement : ");
            EnseignantServices.updateEnseignant(idDept, nom, prenom, email, grade, DepartmentServices.getDepartmentById(id));
            showEnseignants();
            showMenu();
        }
        public static void destroyEnseignant(){
            showEnseignants();
            int id = Main.getIntInput("Selectionnez un enseignant :");
            EnseignantServices.deleteEnseignantById(id);
            showEnseignants();
}
    }

