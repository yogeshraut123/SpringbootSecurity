package com.neosoft.main.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.Model.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findStudentById(int id);

}
