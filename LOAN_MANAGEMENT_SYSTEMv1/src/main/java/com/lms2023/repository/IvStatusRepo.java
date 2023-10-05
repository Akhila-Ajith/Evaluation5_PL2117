package com.lms2023.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lms2023.model.Status;
import com.lms2023.model.VerificationStatus;
@Repository
public interface IvStatusRepo extends CrudRepository<VerificationStatus,Integer> {

}
