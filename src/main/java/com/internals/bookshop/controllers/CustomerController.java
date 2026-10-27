package com.internals.bookshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internals.bookshop.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.internals.bookshop.models.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController 
@CrossOrigin 
@RequestMapping("/customers")
public class CustomerController {
    
    @Autowired 
    CustomerService service;

    @GetMapping("/all")
    public List<Customer> getCustomers() {
        return service.getCustomersService();
    }
    
    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable  int customerId) {
        return service.getCustomerById(customerId);
    }

    @PostMapping("/create")
    public void postCustomer(@RequestBody Customer customer) {
        service.createCustomer(customer);
    }

    @PutMapping("update/{customerId}")
    public void updateCustomer(@RequestBody Customer customer) {
        service.updateCustomer(customer);;
    }

    @DeleteMapping("delete/{customerId}")
    public void deleteCustomer(@PathVariable int customerId) {
        service.deleteCustomer(customerId);
    }
    
    
}
