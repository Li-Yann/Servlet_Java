package sendDirEx;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Form")
public class Servlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String top=req.getParameter("topic");
//		resp.sendRedirect("https://www.google.com");
		resp.sendRedirect("https://www.google.com/search?q="+top);
		
		
		
	}
	

}
