package Student_Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Manager;

import StudentDAO.Student_DAO;
import StudentDTO.Student_DTO;

@WebServlet("/fall")
public class FetchAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		Student_DAO student_DAO = new Student_DAO();
		List<Student_DTO> list = student_DAO.fetchAll();

		// resp.getWriter().print(list);

		req.setAttribute("yamini", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("fetchall.jsp");
		dispatcher.forward(req, resp);

	}

}
