package com.mjm.customer.dal;

import com.mjm.customer.dal.entities.Customer;
import com.mjm.customer.dal.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer(){
		Customer customer = new Customer();
		customer.setName("Mark Case");
		customer.setEmail("markC@mymail.com");

		customerRepository.save(customer);
	}

	@Test
	public void testFindCustomerById(){
		Customer customer = customerRepository.findOne(4l);
		System.out.println(customer);
	}

	@Test
	public void testUpdateCustomer(){
		Customer customer = customerRepository.findOne(4l);
		customer.setEmail("markCase@mymail.com");
		customerRepository.save(customer);
		customer = customerRepository.findOne(4l);
		System.out.println(customer);
	}

	@Test
	public void testDeleteCustomer(){
		customerRepository.delete(4l);
		Customer customer = customerRepository.findOne(4l);
		System.out.println(customer);
	}
}
