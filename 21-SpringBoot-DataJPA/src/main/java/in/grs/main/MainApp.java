package in.grs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.grs.model.Student;
import in.grs.service.StudentService;

@Component
public class MainApp implements CommandLineRunner{
   @Autowired
	private StudentService service;
	@Override
	public void run(String... args) throws Exception {
		Student student=new Student(null,"nitin","rcb",30);
		String save = service.save(student);
		System.out.println(save);
		
		
		
	}
}