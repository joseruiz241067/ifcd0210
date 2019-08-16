<%-- 
    Document   : multiplicacion
    Created on : 16-ago-2019, 12:11:14
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Multiplicación</title>
    </head>
    <body>
        
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.example.CalceeWebService_Service service = new com.example.CalceeWebService_Service();
	com.example.CalceeWebService port = service.getCalceeWebServicePort();
	 // TODO initialize WS operation arguments here
	float i = Float.parseFloat(request.getParameter("variable1"));
	float j = Float.parseFloat(request.getParameter("variable2"));
	// TODO process result here
	java.lang.String result = port.multiplication(i, j);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
