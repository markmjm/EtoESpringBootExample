package com.mjm.customer.dal.repository;

import com.mjm.customer.dal.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
