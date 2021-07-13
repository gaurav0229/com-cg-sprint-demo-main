package com.cg.sprint.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.demo.model.Employer;
import com.cg.sprint.demo.repository.EmployerRepository;
import com.cg.sprint.demo.service.EmployerService;



@RestController
public class EmployerController {
	private static final Logger LOG = LoggerFactory.getLogger(EmployerController.class);

	@Autowired
	private EmployerService service;
	
	@Autowired
	EmployerRepository emprepo;

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
	
	
	
	@RequestMapping("/")
	public String home()
	{
		return "Welcome";
	}
	
	@RequestMapping("/signup")
	public String getSignup()
	{
		return "signup";
	}
	
	
	
	@RequestMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login_user(@RequestParam("username") String username,@RequestParam("password") String password,
			HttpSession session,ModelMap modelMap)
	{	
	Employer auser=emprepo.findByUsernamePassword(username, password);
	if(auser!=null)
	{
		String uname=auser.getEmp_user();
		String upass=auser.getEmp_pass();
	
		if(username.equalsIgnoreCase(uname) && password.equalsIgnoreCase(upass)) 
		{
			session.setAttribute("username",username);
			return "dummy";
		}
		else 
		{
			modelMap.put("error", "Invalid Account");
			return "login";
		}
	}
	else
	{
		modelMap.put("error", "Invalid Account");
		return "login";
	}
	}
	
	@GetMapping(value = "/logout")
	public String logout_user(HttpSession session)
	{
		session.removeAttribute("username");
		session.invalidate();
		return "redirect:/login";
	}
	

}
