package safae.dp.facade;

import java.util.List;

public class FacadeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JDBCFacade facade = new JDBCFacade();
		
		facade.createTable();
		System.out.println("table created ");
		
		facade.insertData();
		System.out.println("insert data into table ");
		
		List<Person> persons = facade.getAllData();
		System.out.println("print all data ");
		
		for(Person p : persons) {
			System.out.println(p.getFirstName()+" "+p.getLastName()+", "+ p.getAge() +" ans");
		}
		
	}

}
