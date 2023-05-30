package in.grs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.grs.model.Student;
import in.grs.repo.StudentRepo;


@RestController
@RequestMapping("/api")
public class MainRestController {
	@Autowired
	private StudentRepo repo;
	@PostMapping("/save")
	public ResponseEntity<?> saveResponse(@RequestBody Student student){
		Student result = repo.save(student);
		return new ResponseEntity<String>("student saved id"+result.getId(),HttpStatus.OK);
	}

}
