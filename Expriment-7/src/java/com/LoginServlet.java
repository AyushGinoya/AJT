package com;
/**
 *
 * @author ginoya
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("userId");
            String name = request.getParameter("userName");
            
            HttpSession ss = request.getSession();
            
            ss.setAttribute("name",name);

            try {
                try (Connection con = DBConnection.getConnection()) {
                    String sq = "SELECT * FROM employee WHERE id=?";

                    PreparedStatement pst = con.prepareStatement(sq);
                    pst.setString(1, id);
                    ResultSet resultSet = pst.executeQuery();

                    if (!resultSet.next()) {
                        String sq2 = "INSERT INTO employee (id, name) VALUES (?, ?)";
                        try (PreparedStatement ist = con.prepareStatement(sq2)) {
                            ist.setString(1, id);
                            ist.setString(2, name);

                            int rowsInserted = ist.executeUpdate();

                            out.println(name + ", Welcome to Our Web Application");
                            response.sendRedirect("MainServlet");
                            ist.close();
                        }
                    } else {
                        out.println("User with ID " + id + " already exists.");
                    }

                    resultSet.close();
                    pst.close();
                }
            } catch (SQLException e) {
                out.println("Error: " + e.getMessage());
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
