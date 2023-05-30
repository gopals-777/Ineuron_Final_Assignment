package ingrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ingrs.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
