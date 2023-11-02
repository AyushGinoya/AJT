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
@WebServlet(name = "SecondServlet", urlPatterns = {"/SecondServlet"})
public class SecondServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            //Cookie
//            Cookie[] cs = request.getCookies();
//            if(cs==null){
//                out.print("Cookie is not Created");
//            } else {
//                out.print("Hello, " + cs[0].getValue());
//            }
            //HttpSession
            HttpSession hs = request.getSession(false);
            /*Returns the current HttpSession associated with this request or, if there is no current session 
               and create is true, returns a new session.*/
            String s = (String) hs.getAttribute("name");

            //String user = (String) request.getAttribute("user");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SecondServlet</title>");
            out.println("</head>");
            out.println("<body>");

            // out.print("<h2>Welcome,</h2>" + user);      //-----> null value print without Cookies
            out.print("Hello, " + s);

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
