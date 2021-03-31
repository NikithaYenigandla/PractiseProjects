
package com.example.SpringRest.Service;

import com.example.SpringRest.Dao.CustomerRepository;
import com.example.SpringRest.Entity.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
       return customerRepository.saveAndFlush(customer);

    }

    @Override
    public String remove(Long phoneNo) {
         customerRepository.deleteById(phoneNo);
        return "deleted successfully";
    }

    @Override
    public List<Customer> getAll() {
        return  customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Long phoneNo) {
        Optional<Customer> optCustomer = customerRepository.findById(phoneNo);
        if(optCustomer.isPresent()) {
            Customer cust = optCustomer.get();
            return cust;
        }
        return null;
    }

    @Override
    public Customer getCustomerByFirstName(String firstName) {

        return customerRepository.findByFirstName(firstName);
    }

    @Override
    public Customer update(Long phoneNo, String firstName) {
        Optional<Customer> optCustomer = customerRepository.findById(phoneNo);
        if(optCustomer.isPresent()) {
            Customer cust = optCustomer.get();
            cust.setFirstName(firstName);
            return customerRepository.save(cust);
        }
        return null;
    }

}

