package com.cms.deloitte.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AmazonCustomer")
public class AmazonCustomer1_1 {
	
	@Id
	@GeneratedValue
	@Column
	private int customerId;
	
	@Column
	private String customerName;
	
	@Column
	private String emailId;
	
	@OneToOne
	@JoinColumn(name = "customerId")
	private AmazonCustomer1_1 amazonCustomer;

	public int getCustomerId() {
		return customerId;
	}

	public AmazonCustomer1_1 getAmazonCustomer() {
		return amazonCustomer;
	}

	public void setAmazonCustomer(AmazonCustomer1_1 amazonCustomer) {
		this.amazonCustomer = amazonCustomer;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
