package com.optum.springBoot.Service;

import com.optum.springBoot.Domain.Students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optum.springBoot.Repository.StudentsRepository;

@Service
public class StudentsService {
	
	@Autowired
	private StudentsRepository studentsRepository;
	
	
	public List<Students> getAllUsers(){
		List<Students> students = new ArrayList<>();
		studentsRepository.findAll().forEach(students::add);
		
		return students;
	}
}
