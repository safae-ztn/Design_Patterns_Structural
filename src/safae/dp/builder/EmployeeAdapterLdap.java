package safae.dp.builder;

public class EmployeeAdapterLdap implements Employee{
	
	private EmployeeLdap instance;
	
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	public EmployeeLdap getInstance() {
		return instance;
	}

	@Override
	public String getId() {
		return this.instance.getCne();
	}

	@Override
	public String getFirstName() {
		return this.instance.getUsername();
	}

	@Override
	public String getLastName() {
		return this.instance.getNickName();
	}

	@Override
	public String getEmail() {
		return this.instance.getMail();
	}
	
	public String toString() {
		return "ID : "+this.instance.getCne()+", first name : "+this.instance.getUsername()+", last name : "+this.instance.getNickName()+
				", email : "+this.instance.getMail();
	}
}
