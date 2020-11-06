package safae.dp.builder;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		/*
		 * get the list of employee one is EmployeeDB and the second is EmployeeLdap
		 * step 1 : we add to our list employeeDB because this type of Employee implments from Employee
		 * step 2 : the second type of Employee is not implementing from Employee but we ganna user our EmployeeAdapterLdap
		 * to adapt this type of Employee (to be like EmployeeDB) and add it to our list
		 */
		EmployeeClient employee = new EmployeeClient();
		List<Employee> list = employee.getEmployeeList();
		System.out.println(list);
	
	}

}
