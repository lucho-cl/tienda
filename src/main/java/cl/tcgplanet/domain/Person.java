package cl.tcgplanet.domain;

import java.time.LocalDate;

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
	private LocalDate birthDate;
	private String user;
	private String pass;
	private CodeName status;
	private LocalDate registered;
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
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
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
	public LocalDate getRegistered() {
		return registered;
	}
	public void setRegistered(LocalDate registered) {
		this.registered = registered;
	}

}
