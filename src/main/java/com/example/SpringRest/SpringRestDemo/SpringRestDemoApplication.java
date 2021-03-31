package com.example.SpringRest.SpringRestDemo;

import com.example.SpringRest.Entity.Customer;
import com.example.SpringRest.Service.CustomerService;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.example.SpringRest.Controller","com.example.SpringRest.Service","com.example.SpringRest.Dao"})
@EntityScan({"com.example.SpringRest.Entity"})
@EnableJpaRepositories("com.example.SpringRest.Dao")
@SpringBootApplication
public class SpringRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//	 CustomerService customerService = (CustomerService) context.getBean("customerService");
//		Customer customer1= new Customer(9009009009L,1, "Debashis", "ZZZZ");
//		Customer customer2= new Customer(9009009010L,2, "Robert","XXX");
//		Customer customer3= new Customer(9009009011L, 3,"Lucy","YYYY");
//
//		customerService.createCustomer(customer1);
//		customerService.createCustomer(customer2);
//		customerService.createCustomer(customer3);
//		System.out.println("Customer Details are added successfuly");
//
//		System.out.println("Enter the phone Number of the Customer which has to be deleted.");
//		Scanner sc = new Scanner(System.in);
//		Long phNo = sc.nextLong();
//		 customerService.remove(phNo);
//
//		System.out.println("Display customer details of PhoneNo");
//		Long phNo2 = sc.nextLong();
//		System.out.println("Customer Details" + customerService.getCustomer(phNo2));
//
//		System.out.println("Display customer details of firstName");
//		String fName = sc.next();
//		System.out.println("Customer Details" + customerService.getCustomerByFirstName(fName));
//
//		System.out.println("Display all customer details");
//		List<Customer> custList = customerService.getAll();
//		for (Customer cust :custList){
//			System.out.println("Customer Details" + cust);
//		}
//		System.out.println("Update customer details");
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Enter phno");
//		Long phNo1 = sc1.nextLong();
//		System.out.println("Enter new name");
//		String fname = sc1.next();
//		customerService.update(phNo1,fname);
//		sc.close();
//		context.close();
//	}
}
