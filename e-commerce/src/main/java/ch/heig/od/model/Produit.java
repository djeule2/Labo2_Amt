package ch.heig.od.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Produit implements Serializable{
    @Id
    @GeneratedValue ( strategy= GenerationType.IDENTITY )
    private int idProduit;
    private int prix;

    @Column(length = 100)
    private String nomProduit;
    @Column(length = 100)
    private String description;
    //private int  idCategorie;
    private int quantite;

    @Column(length = 100)
    private String photos;

    @Column(length = 100)
    private String couleur;
    private int taille;
    @ManyToOne
    @JoinColumn(name ="ID_CAT", nullable = false)
    private Categorie categorie;

    public Produit(){}

    public Produit( String nomProduit, int prix, String description, int quantite, String photos,String couleur, int taille, Categorie categorie) {

        this.prix = prix;
        this.nomProduit = nomProduit;
        this.description = description;
        this.quantite = quantite;
        this.photos = photos;
        this.couleur = couleur;
        this.taille = taille;
        this.categorie = categorie;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public int getPrix() {
        return prix;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getPhotos() {
        return photos;
    }


    public String getCouleur() {
        return couleur;
    }

    public int getTaille() {
        return taille;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return idProduit == produit.idProduit &&
                prix == produit.prix &&
                quantite == produit.quantite &&
                taille == produit.taille &&
                Objects.equals(nomProduit, produit.nomProduit) &&
                Objects.equals(description, produit.description) &&
                Objects.equals(photos, produit.photos) &&
                Objects.equals(couleur, produit.couleur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduit, prix, nomProduit, description, quantite, photos, couleur, taille);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", prix=" + prix +
                ", nomProduit='" + nomProduit + '\'' +
                ", description='" + description + '\'' +
                ", quantite=" + quantite +
                ", photos='" + photos + '\'' +
                ", couleur='" + couleur + '\'' +
                ", taille=" + taille +
                '}';
    }
}
