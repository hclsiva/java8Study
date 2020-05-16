package study.schema.beans;

public class ManagerOfDepartment extends EmployeeInDepartment {

	public ManagerOfDepartment() {		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManagerOfDepartment [getEmployeeId()=");
		builder.append(getEmployeeId());
		builder.append(", getDepartmentId()=");
		builder.append(getDepartmentId());
		builder.append(", getFromDate()=");
		builder.append(getFromDate());
		builder.append(", getToDate()=");
		builder.append(getToDate());
		builder.append("]");
		return builder.toString();
	}

}
