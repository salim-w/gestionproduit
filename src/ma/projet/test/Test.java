package ma.projet.test;

import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;
import java.util.List;
import java.util.Scanner;

public class Test {
    

    public static void main(String[] args) {
        ProduitService produitService = new ProduitService();

        // Créer cinq produits
        produitService.create(new Produit("Produit 1", 50.0));
        produitService.create(new Produit("Produit 2", 200.0));
        produitService.create(new Produit("Produit 3", 300.0));
        produitService.create(new Produit("Produit 4", 400.0));
        produitService.create(new Produit("Produit 5", 150.0));

        // Afficher la liste des produits
        System.out.println("Liste des produits :");
        List<Produit> produits = produitService.findAll();
        produits.forEach(produit -> 
            System.out.println("ID: " + produit.getId() + ", Nom: " + produit.getMarque() + ", Prix: " + produit.getPrix())
        );

        // Afficher les informations du produit dont id = 2
        Produit produit2 = produitService.findById(2);
        System.out.println("\nProduit avec ID 2: Nom: " + produit2.getMarque() + ", Prix: " + produit2.getPrix());

        // Supprimer le produit dont id = 3
        Produit produit3 = produitService.findById(3);
        produitService.delete(produit3);
        System.out.println("\nProduit avec ID 3 supprimé.");

        // Modifier les informations du produit dont id = 1
        Produit produit1 = produitService.findById(1);
        produit1.setMarque("Produit 1 modifié");
        produit1.setPrix(75.0);
        produitService.update(produit1);
        System.out.println("\nProduit avec ID 1 modifié.");

        // Afficher la liste des produits dont le prix est supérieur à 100 DH
        System.out.println("\nProduits avec prix supérieur à 100 DH :");
        produitService.findAll().stream()
                .filter(p -> p.getPrix() > 100)
                .forEach(produit -> 
                    System.out.println("ID: " + produit.getId() + ", Nom: " + produit.getMarque() + ", Prix: " + produit.getPrix())
                );

       
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrez la première date (yyyy-MM-dd) :");
        String date1 = scanner.nextLine();
        System.out.println("Entrez la deuxième date (yyyy-MM-dd) :");
        String date2 = scanner.nextLine();
        System.out.println("\nProduits commandés entre " + date1 + " et " + date2 + " :");
}
  
    }



