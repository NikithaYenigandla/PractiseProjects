package com.example.SpringRest.Service;

import com.example.SpringRest.Entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public String remove(Long phoneNo);
    // Method to get all the Customer record from the db
    public List<Customer> getAll();
    public Customer getCustomer(Long phoneNo);
    public Customer getCustomerByFirstName(String firstName);
    // Method to update a Customer record from the db
    public Customer update(Long phoneNo, String firstName);
}
