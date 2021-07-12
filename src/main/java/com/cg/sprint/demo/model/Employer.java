package com.cg.sprint.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


    @Entity
	@Table(name = "emp_service")
	public class Employer {

		@Id
		private int eid;
		@Column
		private String org_name;
		@Column
		private String emp_add;
		@Column
		private String emp_contact;
		@Column
		private String emp_email;
		@Column
		private String emp_user;
		@Column
		private String emp_pass;
		public Employer() {
			super();
		}
		
		public Employer(int eid, String org_name, String emp_add, String emp_contact, String emp_email, String emp_user,
				String emp_pass) {
			super();
			this.eid = eid;
			this.org_name = org_name;
			this.emp_add = emp_add;
			this.emp_contact = emp_contact;
			this.emp_email = emp_email;
			this.emp_user = emp_user;
			this.emp_pass = emp_pass;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getOrg_name() {
			return org_name;
		}

		public void setOrg_name(String org_name) {
			this.org_name = org_name;
		}

		public String getEmp_add() {
			return emp_add;
		}

		public void setEmp_add(String emp_add) {
			this.emp_add = emp_add;
		}

		public String getEmp_contact() {
			return emp_contact;
		}

		public void setEmp_contact(String emp_contact) {
			this.emp_contact = emp_contact;
		}

		public String getEmp_email() {
			return emp_email;
		}

		public void setEmp_email(String emp_email) {
			this.emp_email = emp_email;
		}

		public String getEmp_user() {
			return emp_user;
		}

		public void setEmp_user(String emp_user) {
			this.emp_user = emp_user;
		}

		public String getEmp_pass() {
			return emp_pass;
		}

		public void setEmp_pass(String emp_pass) {
			this.emp_pass = emp_pass;
		}
		
		@Override
		public String toString() {
			return "Employer [eid=" + eid + ", org_name=" + org_name + ", emp_add=" + emp_add + ", emp_contact="
					+ emp_contact + ", emp_email=" + emp_email + ", emp_user=" + emp_user + ", emp_pass=" + emp_pass
					+ "]";
		}

		
		
		
}




