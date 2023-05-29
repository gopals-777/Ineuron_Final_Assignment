package in.grs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.grs.model.Student;
import in.grs.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	public String save(Student student) {
		Student result = repo.save(student);
		return "student saved with value"+result.getId();
		
	}

}
