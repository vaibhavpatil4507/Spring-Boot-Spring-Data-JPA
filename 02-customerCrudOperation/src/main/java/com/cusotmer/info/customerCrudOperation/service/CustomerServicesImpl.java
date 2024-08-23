package com.cusotmer.info.customerCrudOperation.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cusotmer.info.customerCrudOperation.Dao.customerDao;
import com.cusotmer.info.customerCrudOperation.entity.Customer;

@Service
public class CustomerServicesImpl implements CustomerServices {

	@Autowired(required=true)
	customerDao customerDao;
	
	@Override
	public Customer save(Customer customer) {
		Customer obj=customerDao.save(customer);
		return obj;
	}
	

	@Override
	public Iterable<Customer> saveAll(Iterable<Customer> list) {
		Iterable<Customer> customers=customerDao.saveAll(list);
		return customers;
	}
	

	@Override
	public Optional<Customer> findById(Integer id) {
		Optional<Customer> optional=this.customerDao.findById(id);
		return optional;
	}
	

	@Override
	public Boolean existById(Integer id) {
		Boolean isExist=this.customerDao.existsById(id);
		return isExist;
	}
	

	@Override
	public Iterable<Customer> findAll() {
		Iterable<Customer> allCustomers=this.customerDao.findAll();
		return allCustomers;
	}
	

	@Override
	public Iterable<Customer> findAllById(Iterable<Integer> ids) {
		Iterable<Customer> customersById=this.customerDao.findAllById(ids);
		return customersById;
	}
	

	@Override
	public long count() {
		Long countObjects=this.customerDao.count();
		return countObjects;
	}
	

	@Override
	public void deleteById(Integer id) {
		this.customerDao.deleteById(id);
	}
	

	@Override
	public void delete(Customer entity) {
		this.customerDao.delete(entity);		
	}
	

	@Override
	public void deleteAllById(Iterable<Integer> ids) {
		this.customerDao.deleteAllById(ids);		
	}
	

	@Override
	public void deleteAll(Iterable<Customer	> entities) {
		this.customerDao.deleteAll(entities);		
	}
	

	@Override
	public void deleteAll() {
	    this.customerDao.deleteAll();
	}
	
	

}
