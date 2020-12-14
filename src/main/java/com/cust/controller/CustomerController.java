package com.cust.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController; 

import com.cust.exec.Customers;
import com.cust.service.CustService;


@RestController  
public class CustomerController {
	
	@Autowired  
	CustService custservice;

	@GetMapping("/cust")
	private List<Customers> getAllCustomers()   
	{  
	return custservice.getAllCustomers();
	}  
	
	@GetMapping("/customers/{custId}")  
	private Customers getCustomers(@PathVariable("custId") int custId)   
	{  
	return custservice.getCustomerById(custId);  
	}  
	
	@DeleteMapping("/customers/{custId}")  
	private void deleteCustomer(@PathVariable("custId") int custId)   
	{  
	custservice.delete(custId);  
	}  
	
	@PostMapping("/custs")  
	private int saveCustomer(@RequestBody Customers customers)   
	{  
	custservice.saveOrUpdate(customers);  
	return customers.getCustId();  
	}  
	
	@PutMapping("/custs")  
	private Customers update(@RequestBody Customers customers)   
	{  
	custservice.saveOrUpdate(customers);  
	return customers;  
	}  
}
