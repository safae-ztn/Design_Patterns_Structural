package safae.dp.facade;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBSingleton {
	
	private static volatile DBSingleton instance = null;
	
	public DBSingleton() {
		if(instance != null) {
			throw new RuntimeException("please use getInstance() method !");
		}
	}
	
	public static DBSingleton getInstance() {
		if(instance == null) {
			synchronized (DBSingleton.class) {
				if(instance == null) {
					instance = new DBSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facade","root","");
		}catch(Exception e){ 
			e.printStackTrace();
		}  
		return con;
	}

}
