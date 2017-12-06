<%--
  Created by IntelliJ IDEA.
  User: DarrelWanyonyi
  Date: 21/11/2017
  Time: 08:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Student Registration</title>
  </head>
  <body>
  <h3>Registration Form</h3>
  <form name="register_form" action="servlet/Register" method="POST" >
    <!--Form controls come here-->
    id:<input type="text" name="student_id" placeholder="Enter student id" required />*
    <br><br>
    First Name:<input type="text" name="first_name" placeholder="Enter Your First Name" required />*
    <br><br>
    Last Name:<input type="text" name="last_name" placeholder="Enter Your Last Name" required />*
    <br><br>
    Gender:
    <input type="radio" name="gender"/>Male
    <input type="radio" name="gender"/>Female
    <br><br>
    Degree Program:
    <select name="program" required>
      <option value="">-- Select --</option>
      <option value="BBIT">BBIT</option>
      <option value="BCOM">BCOM</option>
      <option value="LLB">LLB</option>
    </select>*
    <br><br>
    <!-- button to submit form content to the server -->
    <input type="submit" value="Register" name="submit_button"/>
  </form>
  </body>
</html>
