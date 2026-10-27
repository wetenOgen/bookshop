package com.internals.bookshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internals.bookshop.models.Customer;
import com.internals.bookshop.repository.CustomerRepo;

@Service 
public class CustomerService {
 
    @Autowired 
    CustomerRepo repo;

    public List<Customer>  getCustomersService() {
        return repo.findAll();
    }

    public  Customer getCustomerById(int customerId) {
        return repo.getReferenceById(customerId);
    }

    public void createCustomer(Customer customer) {
        repo.save(customer);
    }

    public void  updateCustomer(Customer customer){
        repo.save(customer);
    }

    public void deleteCustomer(int customerId){
        repo.deleteById(customerId);
    }
}
