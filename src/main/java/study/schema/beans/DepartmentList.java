package study.schema.beans;

import java.util.List;

public class DepartmentList {

	private List<Department> departments = null;
	
	public DepartmentList() {		
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

}
