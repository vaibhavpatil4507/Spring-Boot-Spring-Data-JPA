package com.cusotmer.info.customerCrudOperation.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cusotmer.info.customerCrudOperation.Binding.classes.CustomerModel;
import com.cusotmer.info.customerCrudOperation.entity.Customer;
import com.cusotmer.info.customerCrudOperation.service.CustomerServices;
import com.cusotmer.info.customerCrudOperation.utility.ObjectConverter;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerServices customerServices;
	
	//save single object
	//http://localhost:8080/save  post->CustomerObject
	@PostMapping(value="/save",consumes="application/json")
	public Object saveCustomer(@RequestBody CustomerModel customerModel) {
		Customer cust=ObjectConverter.covertorCustModeltoCutomer(customerModel);
		Customer customer=customerServices.save(cust);
		return null;
	}
	
	//http://localhost:8080/saveall   post-->multiple customer objects
	@PostMapping(value="/saveall",consumes="application/json",produces="application/json")
	public ResponseEntity<Iterable<Customer>> saveAllCusmetomers(@RequestBody  List<CustomerModel> customerModel){
		Iterable<Customer> cust=ObjectConverter.covertorListCustModeltoCutomer(customerModel);	
		Iterable<Customer> customers=customerServices.saveAll(cust);		
		return new ResponseEntity<Iterable<Customer>>(customers,HttpStatus.OK);
	}
	
	
	//http://localhost:8080/customers    get to all customers objects
	@GetMapping("/customers")
	public ResponseEntity<Iterable<Customer>> getAllCustomers(){
		Iterable<Customer> customers=customerServices.findAll();	
		return new ResponseEntity<Iterable<Customer>>(customers, HttpStatus.OK);
	}
	
	//http://localhost:8080/customer/70     get one object of customer by id
	@GetMapping("/customer/{cusotmerid}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable Integer cusotmerid){
		Optional<Customer> cust=customerServices.findById(cusotmerid);
		return new ResponseEntity<Optional<Customer>>(cust,HttpStatus.OK);		
	}
	
	//http://localhost:8080/isexist?customerId=70    Get
	@GetMapping("/isexist")
	public ResponseEntity<Boolean> isExistCustomer(@RequestParam("customerId") Integer cusotmerId){
		return new ResponseEntity<Boolean>(this.customerServices.existById(cusotmerId),HttpStatus.OK);
		
	}
	
	//http://localhost:8080/count
	@GetMapping("/count")
	public ResponseEntity<Long> getCount(){
		return new ResponseEntity<Long>(this.customerServices.count(), HttpStatus.OK);
	}
	
	
	//http://localhost:8080/delete?customerId=760
	@DeleteMapping("/delete")
	public ResponseEntity<Boolean> deleteByID(@RequestParam("customerId") Integer customerId){
		 this.customerServices.deleteById(customerId);
		 return new ResponseEntity<Boolean>(!this.customerServices.existById(customerId),HttpStatus.OK);
	}
	
	
	//http://localhost:8080/delete
	@PutMapping(value="/delete")
	public ResponseEntity<Boolean> deletByObject(@RequestBody CustomerModel customer){
		this.customerServices.delete(ObjectConverter.covertorCustModeltoCutomer(customer));
		return new ResponseEntity<Boolean>(!customerServices.existById(customer.getCustomerId()),HttpStatus.OK);
	}
		
}
