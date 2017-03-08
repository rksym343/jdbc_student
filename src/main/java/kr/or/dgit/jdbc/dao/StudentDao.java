package kr.or.dgit.jdbc.dao;

import java.util.List;

import kr.or.dgit.jdbc.dto.Student;

public interface StudentDao {
	Student findStudentById(int studId);
	int insertStudent(Student student);
	void deleteStduent(int studId);
	List<Student> findAllStudents();
}
