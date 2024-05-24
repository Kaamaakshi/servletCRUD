package Student_Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


import StudentDAO.Student_DAO;
import StudentDTO.Student_DTO;

@WebServlet("/fid")
public class FetchById extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pk=req.getParameter("pk");
//		System.out.println(pk);
		int cpk=Integer.parseInt(pk);
		
		Student_DAO student_DAO	=new Student_DAO();
		Student_DTO student_DTO=student_DAO.fetchById(cpk);
		res.getWriter().print(student_DTO);	
	}
}





