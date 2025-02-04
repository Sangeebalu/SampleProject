package org.tcs.env.login;

public class Company extends Employee {
	public void companyId() {
		System.out.println("8999878782391");

	}
	public static void main(String[] args) {
		Company c= new Company();
		c.companyId();//child 1
		c.empId();//Parent
		c.empName();//Parent
	}

}
