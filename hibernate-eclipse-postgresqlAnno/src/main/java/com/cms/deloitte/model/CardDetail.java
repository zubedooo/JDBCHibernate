package com.cms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CardDetail")
public class CardDetail {
	
	@Id
	@GeneratedValue
	@Column
	private int cardId;
	
	@Column
	private String bankName;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private AmazonCustomer amazonCustomer;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public AmazonCustomer getAmazonCustomer() {
		return amazonCustomer;
	}

	public void setAmazonCustomer(AmazonCustomer amazonCustomer) {
		this.amazonCustomer = amazonCustomer;
	}

}
