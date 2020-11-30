package ch.heig.od.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int id;
    private int quantite;
    private int prix;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idProduit")
    private Produit produit;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idCommande")
    private Commande commande;

    public LigneCommande(){}

    public LigneCommande(Produit produit, int quantite, int prix) {

        this.produit = produit;
        this.quantite = quantite;
        this.prix = prix;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LigneCommande that = (LigneCommande) o;
        return produit == that.produit &&
                quantite == that.quantite &&
                prix == that.prix;
    }

    @Override
    public int hashCode() {
        return Objects.hash(produit, quantite, prix);
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "idproduit=" + produit +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}
