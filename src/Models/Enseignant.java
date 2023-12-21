package Models;

import java.util.ArrayList;

public class Enseignant {
    String nom, prenom, email, grade;
    Departement departement = new Departement();
    int id;
    ArrayList<Module> module=new ArrayList<Module>();

    public Enseignant(){
    }
    public Enseignant(String nom,String prenom,String email,String grade,Departement departement){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.grade=grade;
        this.departement=departement;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public Departement getDepartement(){
        return departement;
    }
    public void setDepartement(Departement departement){
        this.departement=departement;
    }
    public ArrayList<Module> getModule() {
        return module;
    }
    public void setModule(ArrayList<Module> module) {
        this.module = module;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}