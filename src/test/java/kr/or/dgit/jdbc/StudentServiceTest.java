package kr.or.dgit.jdbc;


import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.dto.Student;
import kr.or.dgit.jdbc.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testInsertStudent() {
		Student insStudent = new Student(3,"김두환", "kdg@test.co.kr", new Date());
		int res = studentService.insertStudent(insStudent);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testfindAllStudents(){
		List<Student> lists = studentService.findAllStudents();
		for(Student s : lists){ // console에 안 뜸.. log를 찍어야함?
			System.out.println(s);
		}
		Assert.assertNotNull(lists);
	}

}
