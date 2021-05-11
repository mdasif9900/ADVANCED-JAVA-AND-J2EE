<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Assignment 3</title>
</head>
<body>
<%! float area(double len, double breadth) 
{
	return Float.valueOf(String.valueOf(len*breadth));
}

float area(double radius)
{	double pi =3.14;
	double area = pi*radius*radius;
	return Float.valueOf(String.valueOf(area));
}

float area(double a,double b,double c)
{
	double s = (a+b+c)/2;
	double area =(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	return Float.valueOf(String.valueOf(area));
}

%>
<p>The Area of the Rectangle is : <%=area(10.0,20.0) %></p>
<p>The Area of the Circle is : <%=area(10.0) %></p>
<p>The Area of the Triangle is : <%=area(10.0,10.0,10.0) %></p>

</body>
</html>