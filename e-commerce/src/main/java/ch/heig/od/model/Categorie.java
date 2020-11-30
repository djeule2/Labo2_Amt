package ch.heig.od.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Categorie implements Serializable{
    @Id
    @GeneratedValue( strategy= GenerationType.TABLE )
    private int idCategorie;
    @NotEmpty
    @Size(min= 4, max = 50)
    private String nomCategorie;
    private String description;
    @OneToMany(mappedBy = "categorie")
    private Collection<Produit> produits = new ArrayList<Produit>();

    public Categorie(){}

    public Categorie(int idCategorie, String nomCategorie, String description) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
        this.description = description;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Produit> getProduit() {
        return produits;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduit(Collection<Produit> produit) {
        this.produits = produit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorie categorie = (Categorie) o;
        return Objects.equals(idCategorie, categorie.idCategorie) &&
                Objects.equals(nomCategorie, categorie.nomCategorie) &&
                Objects.equals(description, categorie.description) &&
                Objects.equals(produits, categorie.produits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorie, nomCategorie, description, produits);
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "idCategorie=" + idCategorie +
                ", nomCategorie='" + nomCategorie + '\'' +
                ", description='" + description + '\'' +
                ", produits=" + produits +
                '}';
    }
}
