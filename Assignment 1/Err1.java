import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
 
public class Err1 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
String fn=req.getParameter("fn");
String ln=req.getParameter("ln");

  

if(req.getParameter("fn")==""){
	
	res.sendError(400);
}
else{
	pw.println("<b>First Name: " +fn);
	pw.println("<b>Last Name: "+ln);
}
  
pw.close();  
}}  