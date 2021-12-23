package com.neosoft.main.Service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.neosoft.main.Model.Student;

public interface StudentService {

	public void saveStudent(Student s);

	public List<Student> getAll();

	public Object findStudentById(int id);

}
