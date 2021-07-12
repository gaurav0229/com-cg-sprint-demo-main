package com.cg.sprint.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.demo.model.Employer;
import com.cg.sprint.demo.service.EmployerService;

@RestController
public class EmployerController {
	private static final Logger LOG = LoggerFactory.getLogger(EmployerController.class);

	@Autowired
	private EmployerService service;

	// Get All EMployee
	@GetMapping("/getall")
	public List<Employer> getAllEmps() {
		LOG.info("getAllEmps");
		return service.getAllEmployer();
	}

	@PostMapping("/addEmp")
	public Employer addEmp(@RequestBody Employer emp) {
		LOG.info("AddEmp");
		return service.addEmployer(emp);
	}
	
	@DeleteMapping("/deleteemp/{eid}")
	public int deleteEmp(@PathVariable int eid) {
		  LOG.info("DeleteEmployer");
		return service.deleteEmployer(eid);
	}

}
