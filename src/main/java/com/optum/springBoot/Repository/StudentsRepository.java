package com.optum.springBoot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.optum.springBoot.Domain.Students;

public interface StudentsRepository extends CrudRepository<Students, String>{
	
	
}
