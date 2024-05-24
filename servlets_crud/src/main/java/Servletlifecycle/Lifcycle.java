package Servletlifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Lifecycle")
public class Lifcycle implements Servlet{
	

	public Lifcycle() {
		System.out.println("servlet instance/object is created");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() method is invoked, establish db connection");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() method is invoked,request is handled and response is sent");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() method is invoked & servlet instance is destroyed");
		
	}

}
