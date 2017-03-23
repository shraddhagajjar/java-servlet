# java-servlet
it contains jsp - controller -servlet program

First
Created a JSP that will display a multiplication chart back to the user (i.e., similar to the Factorial JSP
example given in the class). You should provide the followings:
• A HTML page that asks the user to enter the number to multiply and up to what number in separate
text boxes/fields
• When the user clicks on the submit button, the request is sent to the Multiply.jsp to generate the
results.
• For example, if the user enters Number to Multiply = 12 and Up to Number = 10, then the response
page should display the followings:
Multiplication Table for 12:
12 x 0 = 0
12 x 1 = 12
. . . [the results for 12 x 2 to 12 x 9] . . .
12 x 10 = 120 

Second
Created a JSP called Register.jsp that will use a Java Bean called ComputeTuition to compute the
total tuition fees, based on the courses that the student registers. You should provide the followings:
• A HTML page that asks the user to select the courses that he/she wishes to register in separate dropdown
menus (choice selection boxes). There should be 4 of these menu boxes, each one contains
these 5 selection choices: Chemistry, Physics, Algorithms, Java, and Capstone.
• After the user makes the selections and clicks on the submit button, the request is sent to the
Register.jsp to generate the results. This JSP uses the ComputeTuition bean (with a “session” scope)
to compute the total tuition fees.
• If the student selects Chemistry or Physics, the tuition fees would be $900 per course.
• If the student selects Algorithms, Java, or Capstone, the tuition fees would be $1,000 per course.
• The student can choose 1, 2, 3, or 4 courses to register (no need to select all 4 choices every time).
• The response page should show the list of courses that the student selected and the total tuition
