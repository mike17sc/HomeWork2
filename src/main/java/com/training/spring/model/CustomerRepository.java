package com.training.spring.model;
/**
 * Created by Mschneider on 29-05-17.
 */
import org.springframework.data.repository.CrudRepository;
public interface  CustomerRepository extends CrudRepository<Customer, Long> {

}
