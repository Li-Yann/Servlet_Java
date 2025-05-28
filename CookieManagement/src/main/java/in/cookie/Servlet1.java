package in.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");  
	    PrintWriter out = resp.getWriter();  
	          
	    String name=req.getParameter("fname");  
	    out.print("Welcome In Servlet1: "+name);  
	    
	    Cookie ck=new Cookie("key",name);//creating cookie object  
	    resp.addCookie(ck);//adding cookie in the response  
	   
	    out.print("<br><br>");
	    out.print("<form action='Servlet2'>");  
	    out.print("<input type='submit' value='Go TO Servlet2'>");  
	    out.print("</form>");  
	          
	    out.close();  
	}
	

}
