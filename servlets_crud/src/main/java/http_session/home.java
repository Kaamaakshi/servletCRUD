package http_session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/homepage")
public class home extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		HttpSession session=req.getSession();
		String name=(String) session.getAttribute("name");
		
		session.setMaxInactiveInterval(10);
		
		  //session.invalidate();
		//resp.setContentType("text/html");
		
		resp.getWriter().print("<a href='logout'>logout</a>");
//		
//		
//		String name=req.getParameter("username");
		resp.getWriter().print("   hii"+" "+name);
		
	}
}
