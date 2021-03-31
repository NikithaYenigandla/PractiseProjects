package com.example.SpringRest.Controller;

import com.example.SpringRest.Entity.Customer;
import com.example.SpringRest.Service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(produces = "application/json")
    public List<Customer> getCustomers(){

        return customerService.getAll();
    }

    @PostMapping(produces = "application/json")
    public Customer createCustomer(@RequestBody Customer customer){
         return customerService.createCustomer(customer);
    }

    @PutMapping(value = "/{phoneNo}",consumes = "application/json")
    public Customer updateCustomer(@PathVariable("phoneNo") long phoneNo,@RequestBody Customer customer) {
        return customerService.update(phoneNo,customer.getFirstName());
    }

    @DeleteMapping(value ="/phoneNo")
    public String deleteCustomer(@PathVariable("phoneNo") long phoneNo) {

        return customerService.remove(phoneNo);
    }
}
