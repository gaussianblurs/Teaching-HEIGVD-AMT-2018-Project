package ch.heigvd.gamification.presentation;

import ch.heigvd.gamification.dao.UsersManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomeServlet")
public class HomeServlet extends HttpServlet {
    @EJB
    private UsersManager usersManager;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user", usersManager.findByEmail("sam@gmail.com"));
        request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request, response);
    }
}
