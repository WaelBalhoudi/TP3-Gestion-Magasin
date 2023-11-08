package tn.tuniprob.gestionmagasin.Exercice1;
public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    public  int numProduit;
    public static int cpt=1;
    private Date date;

    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        if(prix>=0){
            this.prix = prix;
        }else {
            System.out.println("_______________Erreur! le prix de produit N°"+Produit.cpt+"est négatif___________");
        }

        numProduit=cpt;
        cpt++;

    }

    public Produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        prix=0;
        numProduit=cpt;
        cpt++;
    }

    public Produit() {
        numProduit=cpt;
        cpt++;
    }
    public void afficher(){
        System.out.println(
                "la caractéristiques de  produit n°"+numProduit+" est :\n" +
                        "Identifiant :"+identifiant
                        +"\nLibellé :"+libelle
                        +"\nmarque :"+marque
        );
        if(prix!=0){
            System.out.println("\nprix :"+prix);
        }
        System.out.println("________________________________");

    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        if(prix>=0){
            this.prix = prix;
        }else {
            System.out.println("_______________Erreur! le prix de produit N°"+Produit.cpt+"est négatif___________");
        }
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
