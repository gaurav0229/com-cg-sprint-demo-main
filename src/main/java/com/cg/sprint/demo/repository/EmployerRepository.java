package com.cg.sprint.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.sprint.demo.model.Employer;


@Repository
public interface EmployerRepository extends JpaRepository<Employer,Integer> {

	
//	@Query("from Employer where user_email=?1")
//	public List<Employer> findByEMAIL(String email);
	
	@Query("from Employer where emp_user=?1 and emp_pass=?2")
	public Employer findByUsernamePassword(String username,String password);
	
}
