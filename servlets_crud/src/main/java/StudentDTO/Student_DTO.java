package StudentDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_DTO {
	@Id
	private int id;
	private String name;
	private String email;
	private String dob;
	private Long number;
	private String gender;
	private String country;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student_DTO [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", number=" + number
				+ ", gender=" + gender + ", country=" + country + "]";
	}
	
	
	

}
