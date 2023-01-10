/**
 * 
 */
package com.poms.model;

/**
 * @author Surjeet
 *
 */
public class Customer {
	
	public Customer(String customerName, String email, long phone, String address, String dateOfBirth, int age,
			String password, String idProof, String preferredLoginId, int customerId) {
		super();
		CustomerName = customerName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.password = password;
		this.idProof = idProof;
		this.preferredLoginId = preferredLoginId;
		this.customerId = customerId;
	}

	private String CustomerName; 
	private String email ; 
	private long phone;
	private String address; 
	private String dateOfBirth; 
	private int age ;
	private String password;
	private String idProof;
	private String preferredLoginId;
	private int customerId;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
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
		return "Customer [CustomerName=" + CustomerName + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", password=" + password + ", idProof="
				+ idProof + ", preferredLoginId=" + preferredLoginId + ", customerId=" + customerId + "]";
	}
	
	

	
	
	}


