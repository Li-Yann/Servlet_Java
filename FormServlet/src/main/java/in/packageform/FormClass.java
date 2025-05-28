package in.packageform;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormClass extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("fname");
		String gen=req.getParameter("fgender");
		String date=req.getParameter("fdate");
		String faculty=req.getParameter("faculty");
		String cur_year=req.getParameter("fyear");
		String address=req.getParameter("faddress");
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1><b>Name:</b>" + name + "</h1>");
		out.print("<h1><b>Gender:</b>" + gen + "</h1>");
		out.print("<h1><b>DOB:</b>" + date + "</h1>");
		out.print("<h1><b>Faculty:</b>" + faculty + "</h1>");
		out.print("<h1><b>Current Year:</b>" + cur_year + "</h1>");
		out.print("<h1><b>Address:</b>" + address + "</h1>");
		
	}
	

}
