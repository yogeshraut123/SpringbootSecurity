package com.neosoft.main.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.Model.Student;
import com.neosoft.main.Repository.StudentRepository;
import com.neosoft.main.Service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;

	@Override
	public void saveStudent(Student s) {
		sr.save(s);

	}

	@Override
	public List<Student> getAll() {

		List<Student> list = (List<Student>) sr.findAll();

		return list;
	}

	@Override
	public List<Student> findStudentById(int id) {

		return sr.findStudentById(id);
	}

}
