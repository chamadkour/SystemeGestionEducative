package Models;

import java.util.ArrayList;

public class Filiere {
    String intitule;
    Enseignant responsable;
    Departement departement=new Departement();
    int id;

    ArrayList<Module> module=new ArrayList<Module>();

    public Filiere(){
    }
    public Filiere(String intitule,Enseignant responsable,Departement departement){
        this.intitule=intitule;
        this.responsable=responsable;
        this.departement=departement;
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
    public Departement getDepartement(){
        return departement;
    }
    public void setDepartement(Departement departement){
        this.departement=departement;
    }
    public ArrayList<Module> getModule(){
        return module;
    }
    public void setModule(ArrayList<Module> module){
        this.module=module;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
