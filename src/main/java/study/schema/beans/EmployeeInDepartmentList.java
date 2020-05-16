package study.schema.beans;

import java.util.List;

public class EmployeeInDepartmentList {

	private List<EmployeeInDepartment> employeesInDepartment = null;
	public EmployeeInDepartmentList() {		
	}
	public List<EmployeeInDepartment> getEmployeesInDepartment() {
		return employeesInDepartment;
	}
	public void setEmployeesInDepartment(List<EmployeeInDepartment> employeesInDepartment) {
		this.employeesInDepartment = employeesInDepartment;
	}

}
