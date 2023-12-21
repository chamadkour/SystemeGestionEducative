package Models;

import java.util.ArrayList;

public class Departement {
    String intitule;
    Enseignant responsable = new Enseignant();
    int id;
    ArrayList<Filiere> filiere= new ArrayList<Filiere>();

    public Departement(){
    }
    public Departement(String intitule,Enseignant responsable){
        this.intitule=intitule;
        this.responsable=responsable;
    }
    public String getIntitule(){
        return intitule;
    }
    public void setIntitule(String intitule){
        this.intitule=intitule;
    }
    public Enseignant getResponsable(){
        return responsable;
    }
    public void setResponsable(Enseignant responsable){
        this.responsable=responsable;
    }

    public ArrayList<Filiere> getFiliere() {
        return filiere;
    }
    public void setFiliere(ArrayList<Filiere> filiere){
        this.filiere=filiere;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
