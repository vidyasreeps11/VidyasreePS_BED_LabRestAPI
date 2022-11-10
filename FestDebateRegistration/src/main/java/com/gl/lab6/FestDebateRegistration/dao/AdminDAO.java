package com.gl.lab6.FestDebateRegistration.dao;

import java.util.List;

import com.gl.lab6.FestDebateRegistration.Entity.Student;

public interface AdminDAO {
	
	public List<Student> getAllStudents();
	public void saveStudent(Student theStudent);
	public void deleteStudent(int theId);

}
