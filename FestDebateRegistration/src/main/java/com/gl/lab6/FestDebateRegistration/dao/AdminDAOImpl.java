package com.gl.lab6.FestDebateRegistration.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.lab6.FestDebateRegistration.Entity.Student;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Student> getAllStudents() {
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		Query<Student> query=currentSession.createQuery("from Student",Student.class);
		
		List<Student> students=query.getResultList();
		
		return students;
	}

	@Override
	public void saveStudent(Student theStudent) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theStudent);
		

	}

	@Override
	public void deleteStudent(int theId) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		Query query=
				currentSession.createQuery("delete from Student where id=:studentId");
		query.setParameter("studentId", theId);
		
		query.executeUpdate();

	}

}
