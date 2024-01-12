package Controllers;
import Services.*;
import Models.*;

public class EtudiantController {
        public static void showMenu(){
            System.out.println("Etudiants : ");


            System.out.println("Choisir 1: Pour ajouter un etudiant");
            System.out.println("Choisir 2: Pour afficher les etudiants");
            System.out.println("Choisir 3: Pour modifier un etudiant");
            System.out.println("Choisir 4: Pour supprimer un etudiant");
            System.out.println("Choisir 0: Pour retourner au menu principal");

            //"Veuillez sélectionner une option : ")
            int option = Main.getIntInput("Veuillez sélectionner une option : ");
            switch(option) {
                case 1:
                    createEtudiant();
                    break;
                case 2:
                    showEtudiant();
                    break;
                case 3:
                    editEtudiant();
                    break;
                case 4:
                    destroyEtudiant();
                    break;
                default:
                    Main.showPrincipalMenu();
            }
        }
        public static void showEtudiant(){
            for (Etudiant etudiant : DataBase.etudiant) {
                System.out.print("Id : " + etudiant.getId());
                System.out.print(" | Nom : " + etudiant.getNom() + " " + etudiant.getPrenom());
                System.out.print(" | Email : " + etudiant.getEmail() );
                System.out.print(" | Apogée : " + etudiant.getApogee() );
                System.out.print(" | Filière : " + etudiant.getFiliere() );
            }
        }

        public static void createEtudiant() {
            String nom = Main.getStringInput("Entrez le nom de l'étudiant :");
            String prenom = Main.getStringInput("Entrez le prénom de l'étudiant :");
            String email = Main.getStringInput("Entrez l'email de l'étudiant :");
            int apogee = Main.getIntInput("Entrez le code apogee de l'étudiant :");
            FiliereController.showFiliere();
            int id = Main.getIntInput("Sélecionnez un filiere par id :");
            Etudiant etudiant = new Etudiant(nom, prenom, email, apogee, FiliereServices.getFiliereById(id));
            EtudiantServices.addEtudiant(nom,prenom,email,apogee,FiliereServices.getFiliereById(id));
            showEtudiant();
            showMenu();

        }
        public static void editEtudiant(){
            showEtudiant();
            int id = Main.getIntInput("Sélectionnez un étudiant par id");
            String nom = Main.getStringInput("Entrez le nom de l'étudiant :");
            String prenom = Main.getStringInput("Entrez le prénom de l'étudiant :");
            String email = Main.getStringInput("Entrez l'email de l'étudiant :");
            int apogee = Main.getIntInput("Entrez le code apogee de l'étudiant :");
            FiliereController.showFiliere();
            int idFil = Main.getIntInput("Sélecionnez un filiere par id :");
            EtudiantServices.updateEtudiant(id, nom,prenom,email,apogee,FiliereServices.getFiliereById(idFil));
        }
        public static void destroyEtudiant(){
            showEtudiant();
            int id = Main.getIntInput("Selectionnez un étudiant :");
            EtudiantServices.deleteEtudiantById(id);
            showEtudiant();
        }

}

