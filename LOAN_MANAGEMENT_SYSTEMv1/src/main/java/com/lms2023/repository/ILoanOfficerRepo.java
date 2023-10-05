package com.lms2023.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lms2023.model.loanOfficer;
@Repository
public interface ILoanOfficerRepo extends CrudRepository<loanOfficer,Integer> {

}
