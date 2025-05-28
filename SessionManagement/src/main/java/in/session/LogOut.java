package in.session;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@WebServlet("/logout")
public class LogOut extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
			HttpSession session=req.getSession();
			session.invalidate();
			
			RequestDispatcher gr=req.getRequestDispatcher("/index.html");
			gr.forward(req, resp);
		
	}
}
