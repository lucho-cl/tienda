package cl.tcgplanet.domain;

import java.util.Date;

public class Person extends BaseModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5633345626450372481L;
	private Integer id;
	private String name;
	private String lastName;
	private String email;
	private String phone;
	private Date birthDate;
	private String user;
	private String pass;
	private CodeName status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public CodeName getStatus() {
		if(null==status)
			setStatus(new CodeName());
		return status;
	}
	public void setStatus(CodeName status) {
		this.status = status;
	}

}
