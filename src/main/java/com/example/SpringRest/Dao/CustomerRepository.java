package com.example.SpringRest.Dao;

import com.example.SpringRest.Entity.Customer;

import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByFirstName(String firstName);
}
