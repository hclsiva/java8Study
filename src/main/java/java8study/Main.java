package java8study;

import java.io.IOException;
import java.util.List;

import com.google.gson.JsonIOException;

import study.database.util.MysqlDatabaseReader;
import study.json.util.JSonUtil;
import study.logger.util.LOG;
import study.schema.beans.Department;
import study.schema.beans.DepartmentList;
import study.schema.beans.Employee;
import study.schema.beans.EmployeeInDepartment;
import study.schema.beans.EmployeeInDepartmentList;
import study.schema.beans.EmployeeList;
import study.schema.beans.ManagerOfDepartment;
import study.schema.beans.ManagerOfDepartmentList;
import study.schema.beans.Role;
import study.schema.beans.RoleList;
import study.schema.beans.Salary;
import study.schema.beans.SalaryList;

public class Main {

	public Main() {
	}
	public List<Employee> getAllEmployees() {
		MysqlDatabaseReader databaseReader = MysqlDatabaseReader.getInstance();
		return databaseReader.getAllEmployees();
	}
	public List<Department> getAllDepartments() {
		MysqlDatabaseReader databaseReader = MysqlDatabaseReader.getInstance();
		return databaseReader.getAllDepartments();
	}
	public List<Salary> getAllSalaries() {
		MysqlDatabaseReader databaseReader = MysqlDatabaseReader.getInstance();
		return databaseReader.getAllSalaries();
	}
	public List<Role> getAllRoles(){
		MysqlDatabaseReader databaseReader = MysqlDatabaseReader.getInstance();
		return databaseReader.getAllRoles();
	}
	public List<EmployeeInDepartment> getAllEmployeesInDepartment(){
		MysqlDatabaseReader databaseReader = MysqlDatabaseReader.getInstance();
		return databaseReader.getAllEmployeesInDepartment();
	}
	public List<ManagerOfDepartment> getAllManagerOfDepartment(){
		MysqlDatabaseReader databaseReader = MysqlDatabaseReader.getInstance();
		return databaseReader.getManagersOfDepartment();
	}
	
	public void convertSchemaToJson() {
		try {
			LOG.log("Creating Employee json starts");
			EmployeeList employees = new EmployeeList();
			employees.setEmployees(getAllEmployees());
			JSonUtil.toJson(employees, "employees.json");
			LOG.log("Creating Employee json ends");
			
			LOG.log("Creating Department json starts");
			DepartmentList departments = new DepartmentList();
			departments.setDepartments(getAllDepartments());
			JSonUtil.toJson(departments, "departments.json");
			LOG.log("Creating Department json ends");
			
			LOG.log("Creating Salary json Starts");
			SalaryList salaries = new SalaryList();
			salaries.setSalaries(getAllSalaries());
			JSonUtil.toJson(salaries, "salaries.json");			
			LOG.log("Creating Salary json Ends");
			
			LOG.log("Creating Roles json Starts");
			RoleList roles = new RoleList();
			roles.setRoles(getAllRoles());
			JSonUtil.toJson(roles, "roles.json");			
			LOG.log("Creating Roles json Ends");
			
			LOG.log("Creating Employees in a Department starts");
			EmployeeInDepartmentList employeesInDepartment = new  EmployeeInDepartmentList();
			employeesInDepartment.setEmployeesInDepartment(getAllEmployeesInDepartment());
			JSonUtil.toJson(employeesInDepartment, "employeesInDepartment.json");
			LOG.log("Creating Employees in a Department ends");
			
			LOG.log("Creating Manager of a department starts");
			ManagerOfDepartmentList managers = new ManagerOfDepartmentList();
			managers.setManagerOfDepartment(getAllManagerOfDepartment());
			JSonUtil.toJson(managers, "managers.json");
			LOG.log("Creating Manager of a department ends");
			
			
		} catch (JsonIOException | IOException e) {			
			LOG.log(e);
		}
	}
	public void readJsonIntoObjects() {
		EmployeeList employees = JSonUtil.fromJson("employees.json", EmployeeList.class);
		LOG.log("Size of employees Retrieved from database = " + employees.getEmployees().size());
		DepartmentList departments =JSonUtil.fromJson("departments.json", DepartmentList.class);
		LOG.log("Size of department Retrieved from database = " + departments.getDepartments().size());
		SalaryList salaries = JSonUtil.fromJson("salaries.json",SalaryList.class);
		LOG.log("Size of Salaries Retrieved from database = " + salaries.getSalaries().size());
		RoleList roles = JSonUtil.fromJson("roles.json",RoleList.class);
		LOG.log("Size of Roles Retrieved from database = " + roles.getRoles().size());
		EmployeeInDepartmentList employeesInDepartment = JSonUtil.fromJson("employeesInDepartment.json",EmployeeInDepartmentList.class);
		LOG.log("Size of Employees in Department Retrieved from database = " + employeesInDepartment.getEmployeesInDepartment().size());
		ManagerOfDepartmentList managers = JSonUtil.fromJson("managers.json", ManagerOfDepartmentList.class);
		LOG.log("Size of Manager Of Department Retrieved from database = " + managers.getManagerOfDepartment().size());
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.readJsonIntoObjects();
		//main.convertSchemaToJson();		
		//LOG.log("Size of employees Retrieved from database = " + main.getAllEmployees());
		//LOG.log("Size of department Retrieved from database = " + main.getAllDepartments());
		//LOG.log("Size of Salaries Retrieved from database = " + main.getAllSalaries().size());
		//LOG.log("Size of Roles Retrieved from database = " + main.getAllRoles().size());
		//LOG.log("Size of Employees in Department Retrieved from database = " + main.getAllEmployeesInDepartment().size());		
		//LOG.log("Size of Manager Of Department Retrieved from database = " + main.getAllManagerOfDepartment().size());
	}
}
