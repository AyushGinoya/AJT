<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%!
            int ct = 0;
        %>

        <%

            if (session.getAttribute("Ctn") == null) {
                ct = 0;
            }

            ct++;
            session.setAttribute("Ctn", ct);
        %>

        <h1><%= ct%></h1>
    </body>
</html>

