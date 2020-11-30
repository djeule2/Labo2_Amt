package ch.heig.od.presentation;

import ch.heig.od.business.dao.EcommerceDao;
import ch.heig.od.model.Client;
import ch.heig.od.model.Panier;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/checkoutuser")
public class checkoutUser extends HttpServlet {
    @Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/checkout.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passwrd = request.getParameter("passwrd");

        List<String> errors = new ArrayList<>();
        if (userName == null || userName.trim().equals("")) {
            errors.add("Le userName doit être renseigné");
        }
        if (passwrd == null || passwrd.trim().equals("")) {
            errors.add("Le passwrd doit être renseigné");
        }
        Client client = service.checkLogin(userName, passwrd);
        Panier panier = new Panier();

        if (errors.size() == 0 && client != null ) {
                HttpSession session = request.getSession();
                session.setAttribute("client", client);
                session.setAttribute("pagnier", panier);

            request.getRequestDispatcher("/WEB-INF/view/cart.jsp").forward(request, response);
        } else {
            request.setAttribute("errors", userName);
            request.getRequestDispatcher("/WEB-INF/view/checkout.jsp").forward(request, response);
    }


    }

}
