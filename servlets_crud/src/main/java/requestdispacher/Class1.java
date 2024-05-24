package requestdispacher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cls1")
public class Class1  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String name=req.getParameter("name");
		System.out.println("class1"+"------>"+name);
		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("class2.html");
//		dispatcher.forward(req, resp);
	

		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("/cls2");
//		dispatcher.forward(req, resp);
//		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("http:://www.facebook.com");
//		dispatcher.forward(req, resp);
		
//		resp.sendRedirect("http://www.facebook.com");	
		
		resp.sendRedirect("cls2");
		

		
		
	}

}
