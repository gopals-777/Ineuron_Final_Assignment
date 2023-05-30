package in.grs.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.grs.model.Student;

public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

	
}
