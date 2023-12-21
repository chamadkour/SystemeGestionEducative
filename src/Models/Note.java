package Models;

public class Note {
    int note;
    Etudiant etudiant;
    Filiere filiere;
    public Note(){
    }
    public Note(int note,Etudiant etudiant,Filiere filiere){
        this.note=note;
        this.etudiant=etudiant;
        this.filiere=filiere;
    }
    public int getNote(){
        return note;
    }
    public void setNote(int note){
        this.note=note;
    }
    public Etudiant getEtudiant(){
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant=etudiant;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
