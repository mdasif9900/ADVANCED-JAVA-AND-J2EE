package com.First;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
 
public class Redirect extends HttpServlet{  
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
	{  
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		String fn=req.getParameter("fn");
		String ln=req.getParameter("ln");
		res.sendRedirect("https://vtu.ac.in");  

		pw.close();  
	}
}  