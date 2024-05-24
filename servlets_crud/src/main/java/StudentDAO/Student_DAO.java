package StudentDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import StudentDTO.Student_DTO;

public class Student_DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yamini");
	EntityManager manager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public String insertData(Student_DTO student_DTO) {
		transaction.begin();
		manager.persist(student_DTO);
		transaction.commit();
		return "data inserted successfully";

	}

	public Student_DTO fetchById(int id) {
		Student_DTO student_DTO = manager.find(Student_DTO.class, id);
		return student_DTO;

	}

	public List<Student_DTO> fetchAll() {
		Query q = manager.createQuery("select a from Student_DTO a");
		List<Student_DTO> list = q.getResultList();
		return list;

	}

	public String deleteById(int id) {
		Student_DTO student_DTO = manager.find(Student_DTO.class, id);

		if (student_DTO != null) {
			transaction.begin();
			manager.remove(student_DTO);
			transaction.commit();
			return "data deleted successfully";
		} else
			return "data not found";
	}

	public String deleteAll() {
		Query q = manager.createQuery("select a from Student_DTO a");
		List<Student_DTO> list = q.getResultList();
		if (list.isEmpty()) {
			return "data not found";
		} else {
			for (Student_DTO a : list) {
				transaction.begin();
				manager.remove(a);
				transaction.commit();
			}
			return "data deleted successfully";

		}

	}
	
	public String update(Student_DTO student_DTO) {
		transaction.begin();
		manager.merge(student_DTO);
		transaction.commit();
		return "data updated successfully";
	}

}
