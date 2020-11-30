package ch.heig.od.presentation;

import ch.heig.od.business.dao.EcommerceDao;
import ch.heig.od.model.Categorie;
import ch.heig.od.model.Produit;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/registerproduct")
public class AjouteProuduit extends HttpServlet {
@Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/registerProduct.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomProduit = request.getParameter("nomProduit");
        int prixProduit = Integer.parseInt(request.getParameter("prixProduit"));
        String description = request.getParameter("description");
         int quantite = Integer.parseInt(request.getParameter("quantite"));
        String photos = request.getParameter("photos");
        String couleur = request.getParameter("couleur");
        int taille = Integer.parseInt( request.getParameter("taille"));
        int idCategorie = Integer.parseInt(request.getParameter("idCategorie"));

        List<String> errors = new ArrayList<>();
        if (nomProduit == null || nomProduit.trim().equals("")) {
            errors.add("Le nom doit être renseigné");
        }
        if (prixProduit == 0) {
            errors.add("Le prix doit être renseigné");
        }
        if (quantite ==0) {
            errors.add("La quantite du produit doit etre renseigner");
        }

        if (description == null || description.trim().equals("")) {
            errors.add("La description doit être renseigné");
        }

        if (photos == null || photos.trim().equals("")) {
            errors.add("la photos doit etre renseigner");
        }
        if (couleur == null || couleur.trim().equals("")) {
            errors.add("la couleur du produit doit être renseigné");
        }

        if (taille ==0) {
            errors.add("La taille du produit doit etre renseigner");
        }
        if (idCategorie ==0) {
            errors.add("La categorie du produit doit etre renseigner");
        }

        request.setAttribute("nomProduit", nomProduit);
        request.setAttribute("idCategorie", idCategorie);
        request.setAttribute("photos", photos);
        request.setAttribute("prixProduit", prixProduit);
        request.setAttribute("description", description);
        request.setAttribute("couleur", couleur);
        request.setAttribute("taille", taille);
        request.setAttribute("quantite", quantite);

        Categorie categorie = service.getCategorie(idCategorie);

        if (errors.size() == 0) {
            service.addProduit(new Produit(nomProduit, prixProduit,  description, quantite, photos, couleur, taille, categorie ));
            response.sendRedirect(request.getContextPath() + "/produits");
        } else {
            request.setAttribute("errors", errors);
            request.getRequestDispatcher("/WEB-INF/pages/registerProduct.jsp").forward(request, response);
        }

    }

}
