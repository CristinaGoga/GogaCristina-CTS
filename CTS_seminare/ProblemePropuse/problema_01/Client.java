package cts.prototype.problema_01;

public class Client implements Cloneable {
	private String nume;
	private String email;
	private String phone;
	
	public Client(String nume, String email, String phone) {
		super();
		this.nume = nume;
		this.email = email;
		this.phone = phone;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
public Client clone() throws CloneNotSupportedException{
	return(Client) super.clone();
}


}
