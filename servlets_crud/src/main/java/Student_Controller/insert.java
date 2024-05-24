package Student_Controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StudentDAO.Student_DAO;
import StudentDTO.Student_DTO;

@WebServlet("/create")

public class insert implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = arg0.getParameter("id");
		String name = arg0.getParameter("name");
		String email = arg0.getParameter("email");
		String dob = arg0.getParameter("dob");
		String number = arg0.getParameter("number");
		String gender = arg0.getParameter("gender");
		String country = arg0.getParameter("country");
		// System.out.println(id+" "+name);
		// arg1.getWriter().print(id+" "+name);

		Student_DTO student_DTO = new Student_DTO();

		int cid = Integer.parseInt(id);
		student_DTO.setId(cid);
		student_DTO.setName(name);
		student_DTO.setEmail(email);
		student_DTO.setDob(dob);

		Long cnumber = Long.parseLong(number);
		student_DTO.setNumber(cnumber);
		student_DTO.setGender(gender);
		student_DTO.setCountry(country);
		System.out.println(student_DTO);

		Student_DAO student_DAO = new Student_DAO();
		String msg = student_DAO.insertData(student_DTO);
		arg1.getWriter().print(msg);
	}
}
