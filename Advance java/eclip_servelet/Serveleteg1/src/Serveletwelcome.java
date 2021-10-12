import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Serveletwelcome extends HttpServlet {
	private String mymsg;
	public void init() throws ServletException{
		mymsg="Chintan";
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		pw.println("<h1>"+mymsg+"</h1>");
	}
}
