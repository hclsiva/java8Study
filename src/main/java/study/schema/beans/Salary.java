package study.schema.beans;

public class Salary {

	private int employeeId;
	private int salary;
	private String fromDate;
	private String toDate;
	
	public Salary() {		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "Salary [employeeId=" + employeeId + ", salary=" + salary + ", fromDate=" + fromDate + ", toDate="
				+ toDate + "]";
	}

}
