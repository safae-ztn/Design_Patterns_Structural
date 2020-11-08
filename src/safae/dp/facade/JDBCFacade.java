package safae.dp.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCFacade {

	DBSingleton instance = null;
	
	public JDBCFacade() {
		instance = DBSingleton.getInstance();
	}
	
	public int createTable() {
		int count =0;
		try {
			Connection conn = instance.getConnection();
			Statement statement = conn.createStatement();
			count = statement.executeUpdate("CREATE TABLE Person (firstName VARCHAR(255), lastName VARCHAR(255), age INTEGER)");
			statement.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int insertData() {
		int count =0;
		try {
			Connection conn = instance.getConnection();
			Statement statement = conn.createStatement();
			count = statement.executeUpdate("INSERT INTO Person (firstName, lastName, age) VALUES ('safae','ztn',22) ");
			statement.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Person> getAllData(){
		List<Person> list = new ArrayList<>();
		try {
			Connection conn = instance.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Person");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+ rs.getInt(3));
				Person p = new Person();
				p.setFirstName(rs.getString(1));
				p.setLastName(rs.getString(2));
				p.setAge(rs.getInt(3));
				list.add(p);
			}
			rs.close();
			st.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
