package study.database.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import study.logger.util.LOG;
import study.schema.beans.Department;
import study.schema.beans.Employee;
import study.schema.beans.EmployeeInDepartment;
import study.schema.beans.Gender;
import study.schema.beans.ManagerOfDepartment;
import study.schema.beans.Role;
import study.schema.beans.Salary;

public class MysqlDatabaseReader {

	private static MysqlDatabaseReader employeeDatabase = null;
	private Connection mysqlDatabaseConnection = null;
	private PreparedStatement preparedStatement = null;
	private static final String ALL_EMPLOYEE_STATEMENT = "select * from employees";
	private static final String ALL_DEPARTMENT_STATEMENT = "select * from departments";
	private static final String ALL_SALARIES_STATEMENT = "select * from salaries";
	private static final String ALL_TITLES_STATEMENT = "select * from titles";
	private static final String EMPLOYEE_DEPARTMENT = "select * from dept_emp";
	private static final String DEPARTMENT_MANAGER = "select * from dept_manager";

	private MysqlDatabaseReader() {
	}

	private void initConnection() throws SQLException {
		LOG.log("Initialize Connection starts");
		mysqlDatabaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "admin");
		LOG.log("Initialize Connection ends " + mysqlDatabaseConnection);
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employeesList = null;
		ResultSet employeesResult = null;
		try {
			employeeDatabase.initConnection();
			preparedStatement = mysqlDatabaseConnection.prepareStatement(ALL_EMPLOYEE_STATEMENT);
			employeesResult = preparedStatement.executeQuery();
			if (employeesResult.next()) {
				employeesList = new ArrayList<Employee>();
				do {
					Employee employee = new Employee();
					employee.setEmployeeId(employeesResult.getInt("emp_no"));
					employee.setBirthDate(dateToString(employeesResult.getDate("birth_date")));
					employee.setFirstName(employeesResult.getString("first_name"));
					employee.setLastName(employeesResult.getString("last_name"));
					employee.setGender(Gender.valueOf(employeesResult.getString("gender")));
					employee.setHireDate(dateToString(employeesResult.getDate("hire_date")));
					employeesList.add(employee);
				} while (employeesResult.next());
			}
		} catch (SQLException e) {
			LOG.log(e);
		} finally {
			try {
				if (employeesResult != null) {
					employeesResult.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				employeeDatabase.closeConnection();
			} catch (SQLException e) {
				LOG.log(e);
			}
		}
		return employeesList;
	}

	public List<Department> getAllDepartments(){
		List<Department> departments = null;
		ResultSet resultSet = null;
		try {
			employeeDatabase.initConnection();
			preparedStatement = mysqlDatabaseConnection.prepareStatement(ALL_DEPARTMENT_STATEMENT);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				departments = new ArrayList<Department>();
				do {
					Department department = new Department();
					department.setDepartmentId(resultSet.getString("dept_no"));
					department.setDepartmentName(resultSet.getString("dept_name"));
					departments.add(department);
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			LOG.log(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				employeeDatabase.closeConnection();
			} catch (SQLException e) {
				LOG.log(e);
			}
		}
		return departments;
	}
	
	public List<Salary> getAllSalaries(){
		List<Salary> salaries = null;
		ResultSet resultSet = null;
		try {
			employeeDatabase.initConnection();
			preparedStatement = mysqlDatabaseConnection.prepareStatement(ALL_SALARIES_STATEMENT);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				salaries = new ArrayList<Salary>();
				do {
					Salary salary = new Salary();
					salary.setEmployeeId(resultSet.getInt("emp_no"));
					salary.setSalary(resultSet.getInt("salary"));
					salary.setFromDate(dateToString(resultSet.getDate("from_date")));
					salary.setToDate(dateToString(resultSet.getDate("to_date")));
					salaries.add(salary);
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			LOG.log(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				employeeDatabase.closeConnection();
			} catch (SQLException e) {
				LOG.log(e);
			}
		}
		return salaries;
	}
	public List<Role> getAllRoles(){
		List<Role> roles = null;
		ResultSet resultSet = null;
		try {
			employeeDatabase.initConnection();
			preparedStatement = mysqlDatabaseConnection.prepareStatement(ALL_TITLES_STATEMENT);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				roles = new ArrayList<Role>();
				do {
					Role role = new Role();
					role.setEmployeeId(resultSet.getInt("emp_no"));
					role.setRoleName(resultSet.getString("title"));
					role.setFromDate(dateToString(resultSet.getDate("from_date")));
					role.setToDate(dateToString(resultSet.getDate("to_date")));
					roles.add(role);
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			LOG.log(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				employeeDatabase.closeConnection();
			} catch (SQLException e) {
				LOG.log(e);
			}
		}
		return roles;
	}
	public List<EmployeeInDepartment> getAllEmployeesInDepartment(){
		List<EmployeeInDepartment> employeesDepartmentList = null;
		ResultSet resultSet = null;
		try {
			employeeDatabase.initConnection();
			preparedStatement = mysqlDatabaseConnection.prepareStatement(EMPLOYEE_DEPARTMENT);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				employeesDepartmentList = new ArrayList<EmployeeInDepartment>();
				do {
					EmployeeInDepartment empInDept = new EmployeeInDepartment();
					empInDept.setEmployeeId(resultSet.getInt("emp_no"));
					empInDept.setDepartmentId(resultSet.getString("dept_no"));
					empInDept.setFromDate(dateToString(resultSet.getDate("from_date")));
					empInDept.setToDate(dateToString(resultSet.getDate("to_date")));
					employeesDepartmentList.add(empInDept);
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			LOG.log(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				employeeDatabase.closeConnection();
			} catch (SQLException e) {
				LOG.log(e);
			}
		}
		return employeesDepartmentList;
	}
	public List<ManagerOfDepartment> getManagersOfDepartment(){
		List<ManagerOfDepartment> managerDepartmentList = null;
		ResultSet resultSet = null;
		try {
			employeeDatabase.initConnection();
			preparedStatement = mysqlDatabaseConnection.prepareStatement(DEPARTMENT_MANAGER);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				managerDepartmentList = new ArrayList<ManagerOfDepartment>();
				do {
					ManagerOfDepartment managerOfDept = new ManagerOfDepartment();
					managerOfDept.setEmployeeId(resultSet.getInt("emp_no"));
					managerOfDept.setDepartmentId(resultSet.getString("dept_no"));
					managerOfDept.setFromDate(dateToString(resultSet.getDate("from_date")));
					managerOfDept.setToDate(dateToString(resultSet.getDate("to_date")));
					managerDepartmentList.add(managerOfDept);
				} while (resultSet.next());
			}
		} catch (SQLException e) {
			LOG.log(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				employeeDatabase.closeConnection();
			} catch (SQLException e) {
				LOG.log(e);
			}
		}
		return managerDepartmentList;
	}
	private String dateToString(Date date) {
		SimpleDateFormat simpDate = new SimpleDateFormat("dd-MM-yyyy");
		return simpDate.format(date); // output String in MM-dd-yyyy
	}

	private void closeConnection() throws SQLException {
		if (mysqlDatabaseConnection != null) {
			mysqlDatabaseConnection.close();
			LOG.log("Connection to database Closed");
		}
	}

	public static MysqlDatabaseReader getInstance() {
		if (employeeDatabase == null) {
			synchronized (MysqlDatabaseReader.class) {
				if (employeeDatabase == null) {
					employeeDatabase = new MysqlDatabaseReader();
				}
			}
		}
		return employeeDatabase;
	}

}
