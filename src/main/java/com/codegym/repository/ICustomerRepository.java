package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    List<Customer> customerAll();

    Customer list(long id);
}
