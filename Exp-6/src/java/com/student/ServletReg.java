package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ginoya
 *
 */
@WebServlet(name = "ServletReg", urlPatterns = {"/Regstration"})
public class ServletReg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String name = request.getParameter("userName");
            String id = request.getParameter("userId");

            if (name.equals("")) {
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                out.println("<h2>Please Enter Your Name</h2>");
                rd.include(request, response);
                //rd.forward(request, response);
            } else if (id.isEmpty()) {
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                // request.setAttribute("name", name);
                out.println("<h2>Please Enter Your Id</h2>");
                rd.include(request, response);
            } else if (id.isEmpty() && name.isEmpty()) {
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                out.println("<h2>Please Enter Your Name and Id</h2>");
                rd.include(request, response);
            } else {
                try {
                    Connection con = DBConnection.getConnection();
                    String sq = "Select * from studentfilter WHERE id=?";

                    PreparedStatement pst = con.prepareStatement(sq);
                    pst.setString(1, id);
                    ResultSet resultSet = pst.executeQuery();

                    if (!resultSet.next()) {
                        String sq2 = "Insert into studentfilter VALUES (?,?)";
                        PreparedStatement ist = con.prepareStatement(sq2);
                        ist.setString(1, name);
                        ist.setString(2, id);

                        int rowsInserted = ist.executeUpdate();
                        //out.println(rowsInserted + " row(s) Inserted.");

                        out.println(name + ", Welcome to Our Web Application");
                        RequestDispatcher rd = request.getRequestDispatcher("SuccesServlet");
                        rd.forward(request, response);

                        ist.close();
                    } else {
                        out.println("User with ID " + id + " already exists.");
                    }

                    resultSet.close();
                    pst.close();
                    con.close();
                } catch (SQLException e) {
                    out.println("Error: " + e.getMessage());
                }
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

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
