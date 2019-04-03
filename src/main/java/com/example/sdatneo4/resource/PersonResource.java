package com.example.sdatneo4.resource;

import com.example.sdatneo4.domain.Person;
import com.example.sdatneo4.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/persons")
public class PersonResource {

    @Autowired
    PersonService personService;


    @GetMapping
    public Collection<Person> getAll() {
        return personService.getAll();
    }

}
