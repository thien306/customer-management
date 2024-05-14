package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    private CustomerRepository customerRepository;

    public CustomerService() {
        customerRepository = new CustomerRepository();
    }

    @Override
    public List<Customer> customerAll() {
        return customerRepository.customerAll();
    }

    @Override
    public Customer list(long id) {
        return customerRepository.list(id);
    }
}
