<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
		 
      <%
		out.println("<h1 style=\"margin-left: 300px;\">Register</h1>");
		out.println("      <div style=\"border: 1px solid rgb(173, 172, 172); width: 330px; margin-left: 300px; height: 350px;\">");
		out.println("        <form action=\"registerController\" method=\"post\" style=\"width: 450px; margin-left: 50px; margin-right: 15px; margin-top: 40px;\" >");
		out.println("		");
		out.println("          Phone<br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		out.println("          <div style=\"display: flex;\">");
		out.println("              <div >");
		out.println("                First name&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"password\" name=\"password\" size=\"10\"/>");
		out.println("              </div>");
		out.println("              <div style=\"margin-left: 30px;\">");
		out.println("                Last name&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"password\" name=\"password\" size=\"10\"/>");
		out.println("              </div>");
		out.println("          </div>");
		out.println("          <br></br>");
		out.println("          Email address&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		out.println("          Password&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		out.println("          <input type=\"submit\" name=\"login\" value=\"REGISTER\" size=\"10\"/>&nbsp;&nbsp;&nbsp;");
		out.println("         ");
		out.println("         ");
		out.println("          ");
		out.println("        </form>");
		out.println("      </div>");
%>

</body>
</html>