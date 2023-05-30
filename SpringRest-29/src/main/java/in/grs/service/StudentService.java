package in.grs.service;

import in.grs.model.Student;

public interface StudentService {

  
 
 public Iterable<Student> getStudents(Integer pageNo, Integer size);
}
