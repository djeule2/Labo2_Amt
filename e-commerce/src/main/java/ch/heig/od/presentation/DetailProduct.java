package ch.heig.od.presentation;

import ch.heig.od.business.dao.EcommerceDao;
import ch.heig.od.model.Produit;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/detail")
public class DetailProduct extends HttpServlet {
    @Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomProduit = request.getParameter("nomProduit");
        String idProduit = request.getParameter("idProduit");
        String prix = request.getParameter("prix");
        String description = request.getParameter("description");
        String quantite = request.getParameter("quantite");
        String photos = request.getParameter("photos");
        String couleur = request.getParameter("couleur");

        Produit produit = new Produit();
        produit.setPhotos(photos);
        produit.setCouleur(couleur);
        produit.setNomProduit(nomProduit);
        produit.setDescription(description);
        produit.setIdProduit(Integer.parseInt(idProduit));
        produit.setPrix((int) Double.parseDouble(prix));

        request.setAttribute("produit", produit);
        request.getRequestDispatcher("/WEB-INF/view/product-detail.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
