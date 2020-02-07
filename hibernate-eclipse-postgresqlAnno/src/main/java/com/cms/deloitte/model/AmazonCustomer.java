package com.cms.deloitte.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AmazonCustomer")
public class AmazonCustomer {
	
	@Id
	@GeneratedValue
	@Column
	private int customerId;
	
	@Column
	private String customerName;
	
	@Column
	private String emailId;
	
	@OneToMany(mappedBy = "amazonCustomer")
	private Set<CardDetail> cardDetails = new HashSet<CardDetail>();

	public int getCustomerId() {
		return customerId;
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

	public Set<CardDetail> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(Set<CardDetail> cardDetails) {
		this.cardDetails = cardDetails;
	}
	

}
