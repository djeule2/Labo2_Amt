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
import java.util.List;

@WebServlet("/home")
public class Home extends HttpServlet {

    @Inject
    private EcommerceDao service;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int page =1;
        int recordsPerPage = 1;
        if(request.getParameter("page") != null){
            page = Integer.parseInt(request.getParameter("page"));
        }
        List<Produit> produits = service.listProduits((page-1)*recordsPerPage,
                recordsPerPage);
        int noOfRecords = service.getNoOfRecords();
        int noOfPages = (int)Math.ceil(noOfRecords*1.0/recordsPerPage);
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        request.setAttribute("produit", produits);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
