package model;

/**
 * @author Admin
 *
 */
public class register {
	private String address_email;
	private String lastname;
	private String firstname;
	
	private String phone;
	private String password;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String getAddress_email() {
		return address_email;
	}
	public void setAddress_email(String address_email) {
		this.address_email = address_email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
