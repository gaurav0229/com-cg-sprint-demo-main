package com.cg.sprint.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.demo.model.Job;
import com.cg.sprint.demo.service.JobService;

@RestController
public class JobController {
	private static final Logger LOG = LoggerFactory.getLogger(JobController.class);

	@Autowired
	private JobService service;

	// Get All EMployee
	@GetMapping("/getalljob")
	public List<Job> getAllEmps() {
		LOG.info("getAllEmps");
		return service.getAllJob();
	}

	@PostMapping("/addjob")
	public Job addEmp(@RequestBody Job job) {
		LOG.info("AddEmp");
		return service.addJob(job);
	}
	
	@DeleteMapping("/deletejob/{eid}")
	public int deleteEmp(@PathVariable int eid) {
		  LOG.info("DeleteEmployer");
		return service.deleteJob(eid);
	}

	
	@PutMapping("/editjob")
    public Job editjob(@RequestBody Job job) {
        LOG.info("AddEmp");
        return service.editJob(job);
    }


}
