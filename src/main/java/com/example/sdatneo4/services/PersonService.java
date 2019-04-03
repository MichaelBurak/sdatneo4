package com.example.sdatneo4.services;

import com.example.sdatneo4.repository.PersonRepository;
import com.example.sdatneo4.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Collection<Person> getAll() {
        return personRepository.getAllPersons();
    }
}
