package modelo;

public class ModeloLogin {
	
	String pass = "admin";
	String user = "admin";

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getPass() {
		return pass;
	}
}
