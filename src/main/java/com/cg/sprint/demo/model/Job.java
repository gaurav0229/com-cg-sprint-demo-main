package com.cg.sprint.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	@Id
	private int job_id;
	@Column
	private String job_title;
	@Column
	private String job_location;
	@Column
	private String job_desc;
	@Column
	private String job_exp;
	@Column
	private String job_sal;
	@Column
	private String job_noticePeriod;
	@Column
	private String emp_email;
	@Column
	private String job_status;
	public Job() {
		super();
	}
	
	public Job(int job_id, String job_title, String job_location, String job_desc, String job_exp, String job_sal,
			String job_noticePeriod, String emp_email, String job_status) {
		super();
		this.job_id = job_id;
		this.job_title = job_title;
		this.job_location = job_location;
		this.job_desc = job_desc;
		this.job_exp = job_exp;
		this.job_sal = job_sal;
		this.job_noticePeriod = job_noticePeriod;
		this.emp_email = emp_email;
		this.job_status = job_status;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_location() {
		return job_location;
	}

	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}

	public String getJob_desc() {
		return job_desc;
	}

	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}

	public String getJob_exp() {
		return job_exp;
	}

	public void setJob_exp(String job_exp) {
		this.job_exp = job_exp;
	}

	public String getJob_sal() {
		return job_sal;
	}

	public void setJob_sal(String job_sal) {
		this.job_sal = job_sal;
	}

	public String getJob_noticePeriod() {
		return job_noticePeriod;
	}

	public void setJob_noticePeriod(String job_noticePeriod) {
		this.job_noticePeriod = job_noticePeriod;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getJob_status() {
		return job_status;
	}

	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}

	@Override
	public String toString() {
		return "Job [job_id=" + job_id + ", job_title=" + job_title + ", job_location=" + job_location + ", job_desc="
				+ job_desc + ", job_exp=" + job_exp + ", job_sal=" + job_sal + ", job_noticePeriod=" + job_noticePeriod
				+ ", emp_email=" + emp_email + ", job_status=" + job_status + "]";
	}

	
	
	
}

