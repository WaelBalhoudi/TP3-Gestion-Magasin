package tn.tuniprob.gestionmagasin.exercice2;

import tn.tuniprob.gestionmagasin.Exercice1.Produit;

public class TestMagasin {
    public static void main(String[] args) {
        Produit produit1=new Produit(1021,"Lait","delic",2.0);
        Produit produit2=new Produit(2510,"Yaiurt","Vitalait",0.5);
        Produit produit3=new Produit(3250,"Tomate","sucam",-1.2);
        Magasin magasin=new Magasin(10021,"Sidi bouzid Saballa");
        magasin.ajoutProduit(produit1);
        magasin.ajoutProduit(produit2);
        magasin.ajoutProduit(produit3);
        magasin.afficher();

        System.out.println("le nombre des produits de magasin N°"+magasin.numMagasin+" est "+magasin.nombreDeProduit);
    }
}
