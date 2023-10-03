<%-- 
    Document   : delete
    Created on : 03-Oct-2023, 12:36:35 pm
    Author     : ginoy
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="db" 
                       driver="com.mysql.cj.jdbc.Driver"
                       url="jdbc:mysql://localhost:3306/collage?zeroDateTimeBehavior=CONVERT_TO_NULL"
                       user="root" password="Ayush@#2000"/>
        <%! 
            String id;
            String newName;
        %>
        <% 
            id=request.getParameter("ID");
        %>
        <sql:update dataSource="${db}" var="rs">  
            DELETE FROM sqlcrud 
            WHERE id = '<%= id %>'
        </sql:update> 
            
        <% 
            RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
            rd.include(request, response);
        %>
        
        
        
    </body>
</html>
