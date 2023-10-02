package com.student;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

public class Registration implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

   @Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

    String name = request.getParameter("userName");
    String id = request.getParameter("userId"); 

    try {
        Connection con = DBConnection.getConnection();
        String sq = "Select * from studentdata WHERE id=?";

        PreparedStatement pst = con.prepareStatement(sq);
        pst.setString(1, id); 
        ResultSet resultSet = pst.executeQuery();

        if (!resultSet.next()) {
            String sq2 = "Insert into studentdata VALUES (?,?)";
            PreparedStatement ist = con.prepareStatement(sq2);
            ist.setString(1, name);
            ist.setString(2, id); 

            int rowsInserted = ist.executeUpdate();
            

            ist.close();
        } else {
            RequestDispatcher req=request.getRequestDispatcher("index.html");
            req.forward(request, response);
        }

        resultSet.close();
        pst.close();
        con.close();
    } catch (SQLException e) {
        
    }

    chain.doFilter(request, response);
}


    @Override
    public void destroy() {
       
    }
}
