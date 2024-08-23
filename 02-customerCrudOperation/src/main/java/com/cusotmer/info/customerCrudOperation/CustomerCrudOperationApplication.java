package com.cusotmer.info.customerCrudOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cusotmer.info.customerCrudOperation.entity.Customer;
import com.cusotmer.info.customerCrudOperation.service.CustomerServices;


@SpringBootApplication
public class CustomerCrudOperationApplication implements ApplicationRunner {
	
	@Autowired
	private CustomerServices custom;

	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudOperationApplication.class, args);		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//1]save single object or if that is exit then this method perform update query
		
//		Customer cust=new Customer(1, "priya", 938437922L);
//		Customer saveObj=custom.save(cust);
//		System.out.println(saveObj);
		
		
		
		//2]save bulk objects		
//		List<Customer> list=new ArrayList<>();
//		list.add(new Customer(2, "sharaya", 98394398984L));
//		list.add(new Customer(3, "praju", 984928L));
//		list.add(new Customer(4, "arun", 98394398984L));
//		list.add(new Customer(5, "pavan", 98394398984L));
//		Iterable<Customer> customers=custom.saveAll(list);	
//		System.out.println(customers);
		
		
		//3] Find by id
//		Optional<Customer> optional=custom.findById(2);
//		System.out.println(optional);

		
		//4]Object is exist or not
//		Boolean isExit=custom.existById(2000);
//		System.out.println(isExit);
		
		
		//5]Find all objects
//		Iterable<Customer> allObjects=custom.findAll();
//		for(Customer data:allObjects) {
//			System.out.println(data);
//		}
		
		//6] Find all by id
//		List<Integer> list=new ArrayList<>();
//		list.add(2); list.add(4); list.add(100);
//		 Iterable<Customer> someCustomers=custom.findAllById(list);
//		 for( Customer data:someCustomers) {
//			 System.out.println(data);
//		 }
		
		//7]Count the all rows from table
//		Long countObject=this.custom.count();
//		System.out.println(countObject);
		 
		
		//8]Delete by id
//		this.custom.deleteById(2);
		
		
		//9] delete by object values(You need to pass exact values of Customer)
//		Customer obj=new Customer(2, "praju", 984928L);
//		this.custom.delete(obj);
		
		//10]Delete by ids
//		List<Integer> list=new ArrayList<>();
//		list.add(5); list.add(15); list.add(16);
//		Iterable<Integer> ids=list;
//	    this.custom.deleteAllById(ids);
	    
	    
	  //11]Delete by object
//	    List<Customer> list=new ArrayList<>();
//		list.add(new Customer(5,"pavan",98394398984L)); list.add( new Customer(32,"pratap",1265457898L)); 
//		Iterable<Customer> ids=list;
//	    this.custom.deleteAll(list);
	
	
		//12]Delete all
//		this.custom.deleteAll();
		
		
		
	}

}
