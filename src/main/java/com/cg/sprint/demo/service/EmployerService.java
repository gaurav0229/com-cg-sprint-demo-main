package com.cg.sprint.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.demo.model.Employer;
import com.cg.sprint.demo.repository.EmployerRepository;

@Service
public class EmployerService {
	private static final Logger LOG = LoggerFactory.getLogger(EmployerService.class);

	@Autowired
	private EmployerRepository repository;

//Get All Employee
	public List<Employer> getAllEmployer() {
		LOG.info("getAllEmployees");
		return repository.findAll();
	}

	// Register Employer
	public Employer addEmployer(Employer emp) {
		LOG.info("addEmployer");
		return repository.save(emp);
	}
	
	//Delete Employee
		public int deleteEmployer(int eid) {
			LOG.info("deleteEMployer");
			repository.deleteById(eid);
			return eid;
		} 
	
	

}
