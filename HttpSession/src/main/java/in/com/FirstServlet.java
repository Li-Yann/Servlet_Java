package in.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Servlet")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("fname");
		out.println("Name in Servlet: "+name);
		
		HttpSession session=req.getSession();
		session.setAttribute("key", name);
		
		out.println("<form  action='New.jsp' method='post'>");
		out.println("<button>JSp Page</button>");
		out.println("<form>");
	}
	
	

}
