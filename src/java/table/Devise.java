package table;

public class Devise extends BDObject{
    String id;
    String nom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Devise() {
    }

    public Devise(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}
