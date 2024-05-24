package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/c1")
public class Class1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
//		System.out.println(name+"  "+pwd);
		Cookie c1 = new Cookie("name", name);
		Cookie c2 = new Cookie("pwd", pwd);
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.getWriter().print("<a href='c2'>go for c2</a>");
	}
}
