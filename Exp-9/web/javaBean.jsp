<%-- 
    Document   : javaBean
    Created on : 02-Oct-2023, 9:43:52 am
    Author     : ginoya
--%>

<%@ page import="java.io.IOException" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBeans</title>
</head>
<body>
    <jsp:useBean id="jBeans" class="com.example.javabeans.javaBeansClass" scope="request">
        <jsp:setProperty name="jBeans" property="*"/>
    </jsp:useBean>

<div>
    <h1>
        ID: <jsp:getProperty name="jBeans" property="id"/><br><br>
        Name: <jsp:getProperty name="jBeans" property="name"/><br><br>
    </h1>
</div>

</body>
</html>