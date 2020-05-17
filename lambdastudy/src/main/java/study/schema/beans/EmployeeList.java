package study.schema.beans;

import java.util.List;

public class EmployeeList {

	private List<Employee> employees = null;
	
	public EmployeeList() {		
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
