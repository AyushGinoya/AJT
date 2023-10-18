
<%-- 
    Document   : about
    Created on : 18-Oct-2023, 6:05:52 pm
    Author     : ginoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String s = (String) session.getAttribute("name");
            %>
        <%=s%>
        
    </body>
</html>
