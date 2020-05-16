package study.schema.beans;

import java.util.List;

public class ManagerOfDepartmentList {

	private List<ManagerOfDepartment> managers = null; 
	public ManagerOfDepartmentList() {		
	}
	public List<ManagerOfDepartment> getManagerOfDepartment() {
		return managers;
	}
	public void setManagerOfDepartment(List<ManagerOfDepartment> managerOfDepartment) {
		this.managers = managerOfDepartment;
	}

}
