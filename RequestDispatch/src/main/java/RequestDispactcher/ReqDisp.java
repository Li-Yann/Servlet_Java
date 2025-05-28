package RequestDispactcher;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@WebServlet("/Page")
public class ReqDisp extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String eml=req.getParameter("email");
		String passwrd=req.getParameter("pass");
		PrintWriter out=resp.getWriter();
		
		if(eml.equals("abhiyanlimbu4@gmail.com")&&passwrd.equals("Nepal1")) {
			RequestDispatcher rdr=req.getRequestDispatcher("/Profile.jsp");
			rdr.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("<h1 style='color:red'>Not Matched Email and Password</h1>");
			RequestDispatcher red=req.getRequestDispatcher("/index.html");
			red.include(req, resp);
		}
			
		}
		
	}
