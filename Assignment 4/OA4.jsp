<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ASSIGNMENT 4</title>
</head>
<body>
<%! String username="Asif",password = "87654321";%>
<% 
 if(username.equals(request.getParameter("usr_nm"))){
	 if(password.equals(request.getParameter("passwd"))){
		 out.println("<h1>Welcome " +username +" to jsp coding</h1>");}
	 else{out.println("<h1>username and password are incorrect</h1>");}
 }
  else{
	   
	  out.println("<h1>username and password are incorrect</h1>");
  }
%>
</body>
</html>