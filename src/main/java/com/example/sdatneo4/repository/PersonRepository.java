package com.example.sdatneo4.repository;

import com.example.sdatneo4.domain.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PersonRepository extends CrudRepository {
    @Query("MATCH (c:Character)-[r:VALUES]->(i:Item) RETURN c,r,i")
    Collection<Person> getAllPersons();
}
