<%-- 
    Document   : findfees
    Created on : Mar 26, 2016, 11:12:27 AM
    Author     : shraddha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cs532.CalculteFee"  %>
 <jsp:useBean id="CalculateBean" class="cs532.CalculteFee" scope="session" >

 </jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <p>
              <jsp:setProperty name="CalculateBean" property="*" />
     
        
   <h3>You selected  following subjects<br/></h3>
            <jsp:getProperty name="CalculateBean" property="subject1" />
            <jsp:getProperty name="CalculateBean" property="subject2" />
            <jsp:getProperty name="CalculateBean" property="subject3" />
            <jsp:getProperty name="CalculateBean" property="subject4" />
        <br/>  
           Your Tuition Fees would be 
          <%= CalculateBean.CalculteTutionFee() %> $ Thank You!
          
           </p>
            
    </body>
</html>
