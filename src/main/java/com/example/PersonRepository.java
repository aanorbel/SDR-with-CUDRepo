package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@ComponentScan(basePackages = "com.example")
public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findByLastnameOrFirstname(String lastname,String firstname);
}