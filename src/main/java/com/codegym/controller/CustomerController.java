package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("WEB-INF/customers/list.jsp");
        List<Customer> customerList = customerService.customerAll();
        modelAndView.addObject("customers", customerList);
        return modelAndView;
    }

    @GetMapping("/customer")
    public ModelAndView showCustomer(@RequestParam("id") long id) {
        ModelAndView modelAndView = new ModelAndView("WEB-INF/customers/info.jsp");
        Customer customer = customerService.list(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }


}
