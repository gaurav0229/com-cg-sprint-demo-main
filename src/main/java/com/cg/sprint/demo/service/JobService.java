package com.cg.sprint.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.demo.model.Job;
import com.cg.sprint.demo.repository.JobRepository;

@Service
public class JobService {

	private static final Logger LOG = LoggerFactory.getLogger(JobService.class);

	@Autowired
	private JobRepository repository;

    //Get All Job
	public List<Job> getAllJob() {
		LOG.info("getAllJob");
		return repository.findAll();
	}

	// Add Job
	public Job addJob(Job job) {
		LOG.info("addJob");
		return repository.save(job);
	}

	// Delete Job
	public int deleteJob(int eid) {
		LOG.info("deleteJob");
		repository.deleteById(eid);
		return eid;
	}

	// Edit Job
	public Job editJob(Job job) {
		LOG.info("EditJob");
		return repository.save(job);
	}

}
