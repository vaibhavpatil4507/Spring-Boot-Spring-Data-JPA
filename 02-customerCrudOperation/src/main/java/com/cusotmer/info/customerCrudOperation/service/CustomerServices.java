package com.cusotmer.info.customerCrudOperation.service;

import java.util.Optional;

import com.cusotmer.info.customerCrudOperation.entity.Customer;

public interface CustomerServices {

	//To save one customer object
	public Customer save(Customer customer);
	
	//To save bulk customers
	public Iterable<Customer> saveAll(Iterable<Customer> list);
	
	//Find by id
	public Optional<Customer> findById(Integer id);
	
	//Object exit or not checked by id
	public Boolean existById(Integer id);
	
	//find all from table
	public Iterable<Customer> findAll();
	
	
	//find from ids
	public Iterable<Customer> findAllById(Iterable<Integer> ids);
	
	//Count objects
	public long count();
	
	
	//delete object by id
	public void deleteById(Integer id);
	
	
	//delete object passing argument as object
	public void delete(Customer entity);
	
	//delete all passing ids
	public void deleteAllById(Iterable<Integer> ids);
	
	//deleting multiple objects passing list of obj as argument
	public void deleteAll(Iterable<Customer> entities);
	
	//
	public void deleteAll();
}
