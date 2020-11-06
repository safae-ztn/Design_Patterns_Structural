package safae.dp.builder;

public class EmployeeLdap {
	
	private String cne;
	private String username;
	private String nickName;
	private String mail;
	
	public EmployeeLdap(String cne, String username, String nickName, String mail) {
		super();
		this.cne = cne;
		this.username = username;
		this.nickName = nickName;
		this.mail = mail;
	}
	public String getCne() {
		return cne;
	}
	public String getUsername() {
		return username;
	}
	public String getNickName() {
		return nickName;
	}
	public String getMail() {
		return mail;
	}

}
