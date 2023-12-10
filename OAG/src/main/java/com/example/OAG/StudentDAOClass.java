package com.example.OAG;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentDAOClass implements StudentDAO {

	StudentRepository sr;
	
	@Autowired
	public StudentDAOClass(StudentRepository sr) {
		super();
		this.sr = sr;
	}

	@Override
	public void insertStudent(Student s) {
		sr.save(s);
	}
	public Optional<Student> findstubyid(int id)
	{
		return sr.findById(id);
	}
	

}
