package Student_Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StudentDAO.Student_DAO;

@WebServlet("/dall")
public class DeleteAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		Student_DAO student_DAO=new Student_DAO();
		String msg=student_DAO.deleteAll();
		resp.getWriter().print(msg);
		

	}

}
