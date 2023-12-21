package Models;

public class Module {
    String intitule;
    Filiere filiere=new Filiere();
    Enseignant professeur=new Enseignant();

    public Module(){
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
}
