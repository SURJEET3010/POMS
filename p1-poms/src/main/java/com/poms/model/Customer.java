/**
 * POJO class for Customer
 */
package com.poms.model;

/**
 * @author Surjeet
 *
 */
public class Customer {
	
	// Default Constructor 
	public Customer() {
		super();
	}
	
	// Constructor Overloaded
	public Customer(String customerName, String email, String phone, String address, String dateOfBirth, String age,
			String password, String idProof, String preferredLoginId) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.password = password;
		this.idProof = idProof;
		this.preferredLoginId = preferredLoginId;
		
	}

	// Member Variables
	private int customerId;
	private String customerName; 
	private String email ; 
	private String phone;
	private String address; 
	private String dateOfBirth; 
	private String age ;
	private String password;
	private String idProof;
	private String preferredLoginId;
	
	
	// Getter and Setter methods of all member variables
	
	public int getCustomerId() {
		 return customerId;
	}
	

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	
	
	public String getPreferredLoginId() {
		return preferredLoginId;
	}
	public void setPreferredLoginId(String preferredLoginId) {
		this.preferredLoginId = preferredLoginId;
	}

	
	@Override
	public String toString() {
		return "Customer [CustomerName=" + customerName + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", password=" + password + ", idProof="
				+ idProof + ", preferredLoginId=" + preferredLoginId + ", customerId=" + customerId + "]";
	}
	
	}


