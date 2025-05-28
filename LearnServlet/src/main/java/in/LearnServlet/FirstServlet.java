package in.LearnServlet;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
		out.print("Finally,After many attempts....");
		System.out.print("I am on Server");
	}
} 