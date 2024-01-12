package Models;

public class Module {
    String intitule;
    Filiere filiere;
    Enseignant professeur;
    int id;

    public Module(){
    }
    public Module (int id, String intitule, Filiere filiere, Enseignant professeur) {
        this.id=id;
        this.intitule=intitule;
        this.filiere=filiere;
        this.professeur=professeur;
    }
    public String getIntitule(){
        return intitule;
    }
    public void setIntitule(String intitule){
        this.intitule=intitule;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
