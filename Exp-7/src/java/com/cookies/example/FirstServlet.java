package com.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ginoya
 *
 */
@WebServlet(name = "FirstServlet", urlPatterns = {"/FirstServlet"})
public class FirstServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            response.setContentType("text/html");
            String name = request.getParameter("user");
            
            //Cookie 
            
//            Cookie cookie = new Cookie("name", name);
//            response.addCookie(cookie);

            //HttpSession
            
            HttpSession hs =request.getSession();   //Returns the current session associated with this request
            hs.setAttribute("name", name);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FirstServlet</title>");
            out.println("</head>");
            out.println("<body>");

            out.print("<h2>Welcome</h2>" + name);
            out.print("<form action='SecondServlet'>");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");

            out.println("</body>");
            out.println("</html>");
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
