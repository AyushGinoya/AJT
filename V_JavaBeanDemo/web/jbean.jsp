<%-- 
    Document   : jbean
    Created on : 19-Oct-2023, 12:56:59 pm
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
        
        <jsp:useBean id="bean" class="com.example.StudentBean" scope="request">
            <jsp:setProperty name="bean" property="*"/>
        </jsp:useBean>
            
            
        <div>
            
            id:<jsp:getProperty name="bean" property="id"/><br><!-- comment -->
            name:<jsp:getProperty name="bean" property="name"/>
            
        </div>
    </body>
</html>
