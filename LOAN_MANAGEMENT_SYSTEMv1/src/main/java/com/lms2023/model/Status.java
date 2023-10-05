package com.lms2023.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Status {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StatusId")
	private Integer StatusId;
	@Column(name="Status",nullable=false,length=60)
	private String Status;
	public Integer getStatusId() {
		return StatusId;
	}
	public void setStatusId(Integer statusId) {
		StatusId = statusId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
