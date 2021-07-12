package com.cg.sprint.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sprint.demo.model.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer,Integer> {

}
