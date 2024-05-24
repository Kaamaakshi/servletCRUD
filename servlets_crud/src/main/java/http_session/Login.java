package http_session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name=req.getParameter("username");
		String pwd=req.getParameter("pass");
		
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		
		if(name.equals("kaamaakshi") && pwd.equals("2511")) {
			resp.getWriter().print("<a href='homepage'>Home page</a>");		
			}else {
				resp.getWriter().print("enter valid credentials");
			}
		
		//System.out.println(name+"  "+pwd);
	}
}