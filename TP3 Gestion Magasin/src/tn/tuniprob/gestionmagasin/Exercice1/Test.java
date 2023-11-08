package tn.tuniprob.gestionmagasin.Exercice1;
public class Test {
    public static void main(String[] args) {
        Produit produit1=new Produit();
        Produit produit2=new Produit(1021,"Lait","delic");
        Produit produit3=new Produit(2510,"Yaiurt","Vitalait");
        Produit produit4=new Produit(3250,"Tomate","sucam",1.2);
        produit2.afficher();
        produit3.afficher();
        produit4.afficher();
        produit2.setPrix(0.7);
        System.out.println("produit modifé");
        produit2.afficher();
        produit1.setIdentifiant(1000);
        produit1.setLibelle("Yaiurt");
        produit1.setMarque("delic");
        produit1.setPrix(1.3);
        produit1.afficher();
        produit3.setPrix(1.1);
        produit3.afficher();
        System.out.println("dd");
        System.out.println(produit1.toString());
        System.out.println( produit2.toString());
        System.out.println( produit3.toString());
        System.out.println(produit4.toString());
        produit1.setDate(new Date(7,11,2023));
        produit2.setDate(new Date(1,10,2023));
        produit3.setDate(new Date(9,11,2023));
        produit4.setDate(new Date(2,12,2023));
        System.out.println("le date de produit N°1 est");
        produit1.getDate().affDate();
        System.out.println("le date de produit N°2 est");
        produit2.getDate().affDate();
        System.out.println("le date de produit N°3 est");
        produit3.getDate().affDate();
        System.out.println("le date de produit N°4 est");
        produit4.getDate().affDate();
    }
}
