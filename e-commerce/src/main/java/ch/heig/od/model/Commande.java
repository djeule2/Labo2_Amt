package ch.heig.od.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
public class Commande implements Serializable{
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private Long idCommande;
    @Temporal(TemporalType.DATE)
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name ="idClient")
    private Client client;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idCommande")
    private Collection<LigneCommande> ligneCommandes;

    public Commande(){ }

    public Commande(Long idCommande, Date dateCommande, Client client) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return Objects.equals(idCommande, commande.idCommande) &&
                Objects.equals(dateCommande, commande.dateCommande) &&
                Objects.equals(client, commande.client) &&
                Objects.equals(ligneCommandes, commande.ligneCommandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommande, dateCommande, client, ligneCommandes);
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                ", client=" + client +
                ", ligneCommandes=" + ligneCommandes +
                '}';
    }
}
