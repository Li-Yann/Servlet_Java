package in.FirstServer;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Check extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		System.out.print("I am Check Method");
		
		PrintWriter out=resp.getWriter();
		out.print("I am a Servlet File IN server.");
		
		
		
		System.out.println("Hello Eclipse IDE..");
		
	}

}
