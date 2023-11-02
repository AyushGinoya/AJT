<%-- 
    Document   : login
    Created on : 03-Oct-2023, 12:26:14 pm
    Author     : ginoya
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

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

        <sql:query dataSource="${db}" var="rs">  
            SELECT * from sqlcrud;
        </sql:query>


        <table border="2" width="100%">  
            <tr>  
                <th>Student ID</th>  
                <th>First Name</th>   
            </tr>  
            <c:forEach var="table" items="${rs.rows}">  
                <tr>  
                    <td><c:out value="${table.id}"/></td>  
                    <td><c:out value="${table.name}"/></td>   
                </tr>  
            </c:forEach>  
        </table>  
    </body>
</html>
