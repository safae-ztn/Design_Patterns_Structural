package safae.dp.builder;

public class EmployeeDB implements Employee{
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeDB(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return "ID: "+this.getId()+", first name : "+this.getFirstName()+", last name : "+this.getLastName()+", email : "+this.getEmail();
	}
}
