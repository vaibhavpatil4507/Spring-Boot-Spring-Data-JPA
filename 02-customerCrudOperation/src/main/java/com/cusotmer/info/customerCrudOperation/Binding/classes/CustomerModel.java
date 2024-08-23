package com.cusotmer.info.customerCrudOperation.Binding.classes;

import org.springframework.stereotype.Component;

@Component
public class CustomerModel {

	private Integer customerId;
	private String customerName;
	private Long customerContact;
	
	public CustomerModel() {}

	public CustomerModel(Integer customerId, String customerName, Long customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(Long customerContact) {
		this.customerContact = customerContact;
	}

	@Override
	public String toString() {
		return "CustomerModel [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + "]";
	}
	
	
}
