package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/c2")
public class Class2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);	
//		String name=req.getParameter("name");
//		String pwd=req.getParameter("pwd");		
//		System.out.println(name+"  "+pwd);		
//		Cookie[] cookie=req.getCookies();
//		for(Cookie c:cookie) {
//			System.out.println(c.getValue());
//		}
		
	Cookie[] c=req.getCookies();
	for(Cookie c1:c) {
		System.out.println(c1.getValue());
	}
		
	}
}
