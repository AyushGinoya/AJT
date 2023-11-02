<%-- 
    Document   : update
    Created on : 03-Oct-2023, 12:27:57 pm
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

        <c:set var="id" value="${param.ID}" />
        <c:set var="newName" value="${param.newName}" />

        <sql:update dataSource="${db}" var="rowsAffected">
            UPDATE sqlcrud
            SET name = ?
            WHERE id = ?
            <sql:param value="${newName}" />
            <sql:param value="${id}" />
        </sql:update>

        <c:choose>
            <c:when test="${rowsAffected > 0}">
                <p>Update Successful</p>
            </c:when>
            <c:otherwise>
                <p>Update Failed</p>
            </c:otherwise>
        </c:choose>

        <jsp:include page="display.jsp" />
         </body>
</html>
