import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class SecondAssignment extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("Text/html");
		PrintWriter pw = res.getWriter();
		HttpSession hs = req.getSession(true);
		
		Date d = (Date)hs.getAttribute("date");
		if(d==null){
			hs.setAttribute("o_user","");
			hs.setAttribute("n_user","");
		}
		String Ouser = (String)hs.getAttribute("o_user");
		String Nuser = (String)hs.getAttribute("n_user");
		
		if(d!=null && Ouser!="")
		{
			pw.println("<b>Last login user_name is: "+Ouser +"<br>");
			pw.println("<b>Last access date and time is: " +d +"<br>");
		}
		d = new Date();
		hs.setAttribute("date",d);
		Nuser= req.getParameter("user");
		hs.setAttribute("n_user", Nuser);
		Ouser=Nuser;
		pw.println("<b>Current user name is: " +Nuser+"<br>");
		hs.setAttribute("o_user", Ouser);
		pw.println("<b>Current date and time  is:  " +d);
		
	}
	
}


