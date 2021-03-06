package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


//Frontend

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customerdto {

	@XmlElement
	private int customerid;
	
	@XmlElement
	private String firstname;
	
	@XmlElement
	private String lastname;
	
	@XmlElement
	private String address;
	
	@XmlElement
	private String phonenumber;
	
	@XmlElement
	private String email;
	
	@XmlElement
	private String password;
	
	@XmlElement
	private List<Cardto> cars;

	public Customerdto() {}
	
	public Customerdto(String firstname, String lastname, String address, String phonenumber, String email, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public List<Cardto> getCars() {
		return cars;
	}

	public void setCars(List<Cardto> cars) {
		this.cars = cars;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
