package com.lms2023.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lms2023.model.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer,Integer> {

}
