package Models;

import java.util.ArrayList;

public class Etudiant {
    String nom,prenom,email;
    int apogee;
    Filiere filiere;
    int id;
    ArrayList<Note> note=new ArrayList<Note>();

    public Etudiant(){
    }
    public Etudiant(String nom,String prenom, String email,int apogee,Filiere filiere){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.apogee=apogee;
        this.filiere=filiere;
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

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public ArrayList<Note> getNote(){
        return note;
    }
    public void setNote(ArrayList<Note> note){
        this.note=note;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
