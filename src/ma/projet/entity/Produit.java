package ma.projet.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import javax.persistence.TemporalType;

@Entity
@Table(name="Produits")
public class Produit {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="marque")
    private String marque ;
    private String reference ;
    private String destination ;
    private double prix ;
    @Temporal(TemporalType.DATE)
    private Date dateAchat ;

    public Produit() {
    }

    public Produit(int id, String marque, String reference, String destination, double prix, Date dateAchat) {
        this.id = id;
        this.marque = marque;
        this.reference = reference;
        this.destination = destination;
        this.prix = prix;
        this.dateAchat = dateAchat;
    }

    public Produit(String reference, double prix) {
        this.reference = reference;
        this.prix = prix;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
