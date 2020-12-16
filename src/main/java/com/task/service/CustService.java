package com.task.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.task.entity.Customers;
import com.task.repository.CustomerRepository;

@Service
public class CustService {

    final CustomerRepository custrepository;

    public CustService(CustomerRepository custrepository) {
        this.custrepository = custrepository;
    }


    public List<Customers> getAllCustomers() {
        List<Customers> customers = new ArrayList<Customers>();
        custrepository.findAll().forEach(cust1 -> customers.add(cust1));
        return customers;
    }

    public Customers getCustomerById(int custId) {
        return custrepository.findById(custId).get();
    }

    public void saveOrUpdate(Customers customers) {
        custrepository.save(customers);
    }

    public void delete(int custId) {
        custrepository.deleteById(custId);
    }

    public void update(Customers customers, int custId) {
        custrepository.save(customers);
    }

}
