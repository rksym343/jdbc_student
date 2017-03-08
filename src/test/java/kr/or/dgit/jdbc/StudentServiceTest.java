package kr.or.dgit.jdbc;


import static org.junit.Assert.*;
import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.service.StudentService;
import kr.or.dgit.jdbc.util.ConnectionFactory;

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
	public void testConnection() {
		Assert.assertNotNull(connection);
	}

}
