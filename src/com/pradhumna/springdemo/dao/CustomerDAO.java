package com.pradhumna.springdemo.dao;

import com.pradhumna.springdemo.entity.Customer;
import java.util.List;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);

	

	

}
