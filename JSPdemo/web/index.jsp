<%-- 
    Document   : index
    Created on : 24-Sep-2023, 6:02:08 pm
    Author     : ginoya
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Declaration</h1>
        <%!
            int ct = 143;

            int getCount() {
                return ct;
            }
        %>
        <h1>Scriptlat</h1>
        <%
            int ct = 0;
            ct++;
            ct++;
            ct++;
            System.out.println("count: " + ct);
            System.out.println("getCount(): " + getCount());
        %>
        <h1>Expression</h1>

        <%= ct%>
        <%= getCount()%>
        
        <h1>Page Directive</h1>
        
        <%
            LocalDate ld = LocalDate.now();
            LocalDateTime lt = LocalDateTime.now();
        %>
        
        <p>Current Date <%= ld%></p>
        <p> Current Time <%= lt%></p>
        

    </body>
</html>
