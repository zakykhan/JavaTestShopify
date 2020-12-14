package com.cust.repository;

import org.springframework.data.repository.CrudRepository;  
import com.cust.exec.Customers;

public interface CustRepository extends CrudRepository<Customers, Integer>  
{  
}  