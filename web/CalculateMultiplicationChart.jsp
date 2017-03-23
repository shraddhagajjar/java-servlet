<%-- 
    Document   : CalculateMultiplicationChart
    Created on : Mar 21, 2016, 8:37:13 AM
    Author     : shraddha
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
            int n = Integer.parseInt(request.getParameter("number"));
            int upto = Integer.parseInt(request.getParameter("uptonumber"));
             for(int j = 1;j<=upto;j++) {
                    
            
%>
    <%= n %> * <%= j%> = <%= n*j %><br/>
<%
    }
%>
        
    </body>
</html>
