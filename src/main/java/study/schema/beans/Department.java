package study.schema.beans;

public final class Department {
	
	private String departmentId;
	private String departmentName;
	
	public Department() {		
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [deparmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

}
