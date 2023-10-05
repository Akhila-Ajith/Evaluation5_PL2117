package com.lms2023.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class loanOfficer {
	public Integer getLoanOfficerId() {
		return loanOfficerId;
	}
	public void setLoanOfficerId(Integer loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}
	public String getLoanOfficerName() {
		return loanOfficerName;
	}
	public void setLoanOfficerName(String loanOfficerName) {
		this.loanOfficerName = loanOfficerName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="loanOfficerId")
	private Integer loanOfficerId;
	@Column(name="loanOfficerName",nullable=false,length=60)
	private String loanOfficerName;
	//check the status of loan officer
	private boolean isActive=true;
}
