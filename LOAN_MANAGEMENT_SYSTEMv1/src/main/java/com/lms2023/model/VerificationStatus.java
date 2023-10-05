package com.lms2023.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VerificationStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vStatusId")
	private Integer vStatusId;
	@Column(name="vStatus",nullable=false,length=60)
	private String vStatus;
	public Integer getvStatusId() {
		return vStatusId;
	}
	public void setvStatusId(Integer vStatusId) {
		this.vStatusId = vStatusId;
	}
	public String getvStatus() {
		return vStatus;
	}
	public void setvStatus(String vStatus) {
		this.vStatus = vStatus;
	}

}
