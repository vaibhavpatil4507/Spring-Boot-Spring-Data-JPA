package com.cusotmer.info.customerCrudOperation.Dao;

import org.springframework.data.repository.CrudRepository;

import com.cusotmer.info.customerCrudOperation.entity.Customer;

public interface customerDao extends CrudRepository<Customer, Integer> {

}
