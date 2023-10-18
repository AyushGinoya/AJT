/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ginoya
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String name = request.getParameter("name");
            String id = request.getParameter("id");

             try {
            Connection con = Jdbc.getConnection();
            String sq = "Select * from studentfilter WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sq);
            pst.setString(1, id);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                out.println("User with ID " + id + " already exists.");
                resultSet.close();
                pst.close();
                con.close();
                return;
            }

            String sq2 = "Insert into studentfilter VALUES (?,?)";
            PreparedStatement ist = con.prepareStatement(sq2);
            ist.setString(1, id);
            ist.setString(2, name);

            int rowsInserted = ist.executeUpdate();
            out.println(name + ", Welcome to Our Web Application");
            RequestDispatcher rd = request.getRequestDispatcher("HomePage");
            rd.forward(request, response);

            ist.close();
            resultSet.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            out.println("Error: " + e.getMessage());
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
