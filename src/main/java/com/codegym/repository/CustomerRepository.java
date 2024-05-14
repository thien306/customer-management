package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository implements ICustomerRepository {

    Map<Integer, Customer> customerList;

    public CustomerRepository() {
        customerList = new HashMap<>();
        customerList.put(1, new Customer(1, "hứa thu sương", "huathusuong@gmail.com", "lạng sơn"));
        customerList.put(2, new Customer(2, "lê thị sương", "lethisuong@gmail.com", "bình phước"));
        customerList.put(3, new Customer(3, "trần thị ngọc anh", "tranthingocanh@gmail.com", "hà nội"));
        customerList.put(4, new Customer(4, "ali quốc thiên", "quocthien@gmail.com", "hồ chí minh"));
        customerList.put(5, new Customer(5, "lâm thị thủy", "lamthithuy@gmail.com", "nghệ an"));
    }


    @Override
    public List<Customer> customerAll() {
        return new ArrayList<>(customerList.values());
    }

    @Override
    public Customer list(long id) {
        return customerList.get(id);
    }
}
