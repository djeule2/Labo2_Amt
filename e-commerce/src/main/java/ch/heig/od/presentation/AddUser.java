package ch.heig.od.presentation;

import ch.heig.od.business.dao.EcommerceDao;
import ch.heig.od.model.Client;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/adduser")
public class AddUser extends HttpServlet {

    @Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomClient = request.getParameter("nomClient");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String username = request.getParameter("userName");
        String passwrd = request.getParameter("passwrd");


        List<String> errors = new ArrayList<>();
        if (nomClient == null || nomClient.trim().equals("")) {
            errors.add("Le nom doit être renseigné");
        }
        if (email == null || email.trim().equals("")) {
            errors.add("Le idProduit doit être renseigné");
        }
        if (tel == null || tel.trim().equals("")) {
            errors.add("Le idProduit doit être renseigné");
        }

        if (username == null || username.trim().equals("")) {
            errors.add("La description doit être renseigné");
        }

        if (passwrd == null || passwrd.trim().equals("")) {
            errors.add("Le prix du produit doit être renseigné");
        }

        request.setAttribute("nomClient", nomClient);
        request.setAttribute("email", email);
        request.setAttribute("tel", tel);
        request.setAttribute("username", username);
        request.setAttribute("passwrd", passwrd);

        if (errors.size() == 0) {
            service.ajouterUser(new Client(nomClient, email, tel, username, passwrd ));
            response.sendRedirect(request.getContextPath() + "/cart");
        } else {
            request.setAttribute("errors", errors);
            request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
        }

    }
}
