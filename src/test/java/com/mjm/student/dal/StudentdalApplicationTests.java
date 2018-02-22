package com.mjm.student.dal;

import com.mjm.student.dal.entities.Student;
import com.mjm.student.dal.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateStrudent(){
		Student student = new Student();
		student.setName("Mark Case");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById(){
		Student student = studentRepository.findOne(1l);
		System.out.println(student);
	}

	@Test
	public void testUpdateStudent(){
		Student student = studentRepository.findOne(1l);
		student.setFee(40d);
		studentRepository.save(student);
		student = studentRepository.findOne(1l);
		System.out.println(student);
	}

	@Test
	public void testDeleteStudent(){
		studentRepository.delete(1l);
		Student student = studentRepository.findOne(1l);
		System.out.println(student);
	}
}
