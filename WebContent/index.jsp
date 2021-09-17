<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
out.println("<h1 style=\"margin-left: 300px;\">Login</h1>");
out.println("      <div style=\"border: 1px solid rgb(202, 198, 198); width: 380px; margin-left: 300px; height: 300px;\">");
out.println("        <form action=\"loginController\" method=\"post\" style=\"width: 360px; margin-left: 20px; margin-right: 15px; margin-top: 40px;\" >");
out.println("		");
out.println("          Username or email address<br><input type=\"text\" name=\"name\" size=\"30\"/><br></br>");
out.println("          Password<br><input type=\"password\" name=\"password\" size=\"30\"/><br></br>");
out.println("          <input type=\"submit\" name=\"login\" value=\"Login\" size=\"10\"/>&nbsp;&nbsp;&nbsp;");
out.println("          <input type=\"checkbox\"/>Remember me<br>");
out.println("          ");
out.println("          <a href=\"#\">Lost your password?</a>");
out.println("        </form>");
out.println("      </div>");
%>
</body>
</html>