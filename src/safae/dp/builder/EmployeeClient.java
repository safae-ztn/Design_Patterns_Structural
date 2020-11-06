package safae.dp.builder;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	List<Employee> getEmployeeList(){
		
		List<Employee> list = new ArrayList<>();
		Employee e = new EmployeeDB("H125847", "safae", "Janat" , "safaejanat@gmail.com");
		list.add(e);
		EmployeeLdap employee = new EmployeeLdap("C15896", "youssef", "ZTn" , "yousseflahlou@gmail.com");
		list.add(new EmployeeAdapterLdap(employee));
		return list;
	}

}
