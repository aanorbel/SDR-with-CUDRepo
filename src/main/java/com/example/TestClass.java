package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestClass {
    @Autowired
    private PersonRepository repo;

    @PostConstruct
    public void basicCrudOperations() {

        Person rand = new Person("rand", "al'thor");
        rand.setAddress(new Address("emond's field", "andor"));
        repo.save(rand);

        System.out.println(repo.findOne(rand.getId()));
        System.out.println(repo.count());
        System.out.println(repo.findByLastnameOrFirstname("rand", "rand"));
//        repo.delete(rand);
    }
}
