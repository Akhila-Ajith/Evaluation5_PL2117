package com.lms2023.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customerId")
	private Integer customerId;
	
	//customer name
	@Column(name="customerName",nullable=false,length=60)
	private String customerName;
	
	//check the status of customer
	private boolean isActive=true;
	
	@Column(name="loanType",nullable=false,length=60)
	private String loanType;
	
	@Column(name="loanAmount",nullable=false,length=60)
	private String loanAmount;
	
	
	
	//mapping
	private Integer loanOfficerId;
	@ManyToOne
	@JoinColumn
	(name="loanOfficerId",insertable=false,updatable=false)
	private loanOfficer loanOfficer;
	
	private Integer vStatusId=2;
	@ManyToOne
	@JoinColumn
	(name="vStatusId",insertable=false,updatable=false)
	private VerificationStatus VerificationStatus;
	
	private Integer StatusId=2;
	@ManyToOne
	@JoinColumn
	(name="StatusId",insertable=false,updatable=false)
	private Status status;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Integer getLoanOfficerId() {
		return loanOfficerId;
	}
	public void setLoanOfficerId(Integer loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}
	public loanOfficer getLoanOfficer() {
		return loanOfficer;
	}
	public void setLoanOfficer(loanOfficer loanOfficer) {
		this.loanOfficer = loanOfficer;
	}
	public Integer getvStatusId() {
		return vStatusId;
	}
	public void setvStatusId(Integer vStatusId) {
		this.vStatusId = vStatusId;
	}
	public VerificationStatus getVerificationStatus() {
		return VerificationStatus;
	}
	public void setVerificationStatus(VerificationStatus verificationStatus) {
		VerificationStatus = verificationStatus;
	}
	public Integer getStatusId() {
		return StatusId;
	}
	public void setStatusId(Integer statusId) {
		StatusId = statusId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
