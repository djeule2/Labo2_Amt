package ch.heig.od.business.dao;

import ch.heig.od.model.*;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EcommerceDao {

    /*PRODUIT*/

    /**
     *
     * @return
     */
    public Produit getProduit(int idPro);

    /**
     *
     * @param
     *
     */
    public void addProduit(Produit produitt);

    /**
     *
     * @param
     *
     */
    public void addLigneCommande(LigneCommande ligneCommande);

    /**
     *
     * @return
     */
    public List<Produit> listProduits(int offset, int noOfRecords);

    /**
     *
     * @param idCat
     * @return
     */
    public List<Produit>listProduitParCategorie(int idCat, int offset, int noOfRecords);

    /**
     * */
   // public List<LigneCommande>listeLigneCommande(int idPagnier);


    /**
     *
     * @param idPro
     */
   // public void suprimeProduit(Long idPro);

    /**
     *
     * @param p
     */
  //  public void modifierProduit(Produit p);

    /**
     *
     * @return
     */
   // public List<Produit> listeProduitSelectionne();

    /*CATEGORIE*/

    /**
     *
     * @return
     */
   // public List<Categorie> listCategories();

    /**
     *
     * @param cat
     * @return
     */
    // public Long addCategorie (Categorie cat);

    /**
     *
     * @param idCat
     * @return
     */
    public Categorie getCategorie(int idCat);

    /**
     *
     * @param cat
     */
   // public void modifierCategorie(Categorie cat);

    /*USER*/

    /**
     *
     * @param user
     */
    public void ajouterUser (Client user);

    /**
     *
     * @param user
     * @param role
     */
   // public void affectRole (long userID, Role role);

    /**
     *
     * @param panier
     * @param client
     * @return
     */
    public Commande enreigistrerCommande(Panier panier, Client client);

    /**
     *
     * @param userName
     * @param passwrd
     * @return
     */

    public Client checkLogin(String userName, String passwrd);

    public int getNoOfRecords();

}
