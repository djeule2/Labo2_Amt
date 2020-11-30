package ch.heig.od.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Client implements Serializable{
    @Id
    @GeneratedValue ( strategy= GenerationType.AUTO )
private int idClient;
private String nomClient;
private String email;
private String tel;
private String userName;
private String passwrd;
@OneToMany(mappedBy = "client")
private Collection<Commande> commandes;

    public Client(){}

    public Client( String nomClient, String email, String tel, String userName, String passwrd) {
        this.userName = userName;
        this.passwrd = passwrd;
        this.nomClient = nomClient;
        this.email = email;
        this.tel = tel;

    }



    public int getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient &&
                Objects.equals(nomClient, client.nomClient) &&
                Objects.equals(email, client.email) &&
                Objects.equals(tel, client.tel) &&
                Objects.equals(userName, client.userName) &&
                Objects.equals(passwrd, client.passwrd) &&
                Objects.equals(commandes, client.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, nomClient, email, tel, userName, passwrd, commandes);
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nomClient='" + nomClient + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", userName='" + userName + '\'' +
                ", passwrd='" + passwrd + '\'' +
                ", commandes=" + commandes +
                '}';
    }
}
