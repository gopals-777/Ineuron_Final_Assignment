package in.grs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.grs.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
