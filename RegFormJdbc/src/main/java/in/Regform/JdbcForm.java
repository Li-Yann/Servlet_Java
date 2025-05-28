package in.Regform;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JdbcForm extends HttpServlet{
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
		
		
		
		try{
            String url = "jdbc:mysql://localhost:3306/regswing";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "AdminUser");
            String query = "INSERT INTO jdbcservlet (name, gen, date, faculty,cur_year,address)"
            		+ " VALUES (?, ?, ?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, gen);
            preparedStatement.setString(3, date);
            preparedStatement.setString(4, faculty);
            preparedStatement.setString(5, cur_year);
            preparedStatement.setString(6, address);

            preparedStatement.executeUpdate();
            System.out.println("Data inserted");

		} catch (Exception e) {
            e.printStackTrace();  // Print detailed error message
            out.print("<h1>Error: " + e.getMessage() + "</h1>");
        }
		
	}
	

}

