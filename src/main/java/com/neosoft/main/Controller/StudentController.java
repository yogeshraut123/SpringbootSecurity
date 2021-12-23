package com.neosoft.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.Model.Student;

import com.neosoft.main.Service.StudentService;

@RestController
@RequestMapping("/rest")
public class StudentController {

	@Autowired
	StudentService ss;

	@GetMapping("/getAll")
	public List<Student> login() {
		List<Student> list = ss.getAll();
		return list;
	}

	@GetMapping("/Student/{id}")
	public ResponseEntity<List<Student>> getStudentById(@PathVariable("id") int id) {
		return new ResponseEntity(ss.findStudentById(id), HttpStatus.OK);
	}

}
