<%-- 
    Document   : TutionFees
    Created on : Mar 25, 2016, 1:47:44 PM
    Author     : shraddha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculate Tution Fess</title>
    </head>
    <body>
        <%@page import="cs532.CalculteFee"  %>
       


        <form method="post" action="findfees.jsp">

            <h2>Compute Tuition Fees </h2>
            <p>
                Subject List 1 : 
                <select name="subject1">
                    <option value="Chemistry">Chemistry</option>
                    <option value="Physics">Physics</option>
                    <option value="Algorithm">Algorithm</option>
                    <option value="Java">Java</option>
                    <option value="Capstone">Capstone</option>
                </select>

            </p>


            <p>
                Subject List 2 : 
                <select name="subject2">
                    <option value="Chemistry">Chemistry</option>
                    <option value="Physics">Physics</option>
                    <option value="Algorithm">Algorithm</option>
                    <option value="Java">Java</option>
                    <option value="Capstone">Capstone</option>
                </select>

            </p>

            <p>
                Subject List 3 : 
                <select name="subject3">
                    <option value="Chemistry">Chemistry</option>
                    <option value="Physics">Physics</option>
                    <option value="Algorithm">Algorithm</option>
                    <option value="Java">Java</option>
                    <option value="Capstone">Capstone</option>
                </select>

            </p>

            <p>
                Subject List 4 : 
                <select name="subject4">
                    <option value="Chemistry">Chemistry</option>
                    <option value="Physics">Physics</option>
                    <option value="Algorithm">Algorithm</option>
                    <option value="Java">Java</option>
                    <option value="Capstone">Capstone</option>
                </select>

            </p>
            <p><input type="submit" name="submit" value="Calculate Tution Fees">
                <input type="reset" value="Reset"></p>

        </form>  

    </body>
</html>
