package com.neosoft.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.Model.Student;
import com.neosoft.main.Service.StudentService;

@RestController
@RequestMapping("/noAuth")
public class NoAuthController {
	@Autowired
	StudentService s1;

	@PostMapping("/saveStudent")
	public String register(@RequestBody Student s) {
		s1.saveStudent(s);
		return "Data Saved";
	}

}
