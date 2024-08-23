package com.cusotmer.info.customerCrudOperation.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cusotmer.info.customerCrudOperation.Binding.classes.CustomerModel;
import com.cusotmer.info.customerCrudOperation.entity.Customer;

public class ObjectConverter {

	public static Customer covertorCustModeltoCutomer(CustomerModel model) {
		return new Customer(model.getCustomerId(), model.getCustomerName(), model.getCustomerContact());
	}

	
	
	public static Iterable<Customer> covertorListCustModeltoCutomer(List<CustomerModel> models) {
		List<Customer> list = new ArrayList<>();

		for (CustomerModel model : models) {
			list.add(covertorCustModeltoCutomer(model));
		}

		return list;

	}

	
	
	public static CustomerModel convertCustomerModelToCustomer(Customer cust) {
		return new CustomerModel(cust.getCustomerId(), cust.getCustomerName(), cust.getCustomerContact());
	}

}
