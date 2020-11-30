package ch.heig.od.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Panier{
    private  Map<Integer, LigneCommande> produitPagnier = new HashMap<Integer, LigneCommande>();
    public void addPagnier(Produit produit, int quantite){
        LigneCommande ligneCommande = produitPagnier.get(produit.getIdProduit());
        if(ligneCommande==null){
            LigneCommande art = new LigneCommande();
            art.setProduit(produit);
            art.setQuantite(quantite);
            art.setPrix(produit.getPrix());
            produitPagnier.put(produit.getIdProduit(), art);
        }
        else {
            ligneCommande.setQuantite(ligneCommande.getQuantite() + quantite);
        }
    }

    public Collection<LigneCommande> getPagnier (){
        return produitPagnier.values();
    }

    public int getSize(){
        return produitPagnier.size();
    }

    public double getTotal(){
        double total = 0;
        for(LigneCommande lc : produitPagnier.values()){
            total += lc.getPrix()*lc.getQuantite();
        }
        return total;
    }
    public void deleteProduitPagnier(Long idprduit){
        produitPagnier.remove(idprduit);
    }
}
