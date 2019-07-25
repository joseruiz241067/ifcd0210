<%-- 
    Document   : jspejemplo
    Created on : 23-jul-2019, 11:25:40
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalDate"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mi Primera Página!</h1>
        Hoy es:
        <%
            String hoy = LocalDate.now().toString();
            %>
            <%=hoy%>
            El parámetro id vale:
            <%=request.getParameter("id")%>
            
                    
            <br>
            
            
            
    </body>
</html>
