package com.micronautfirstproject.repository;

import com.micronautfirstproject.models.Person;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    @Query("SELECT p FROM Person p ORDER BY name ASC")
    List<Person> displayNameinAsc();

    Person findByAge(int age);
}
