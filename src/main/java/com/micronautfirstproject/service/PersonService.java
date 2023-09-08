package com.micronautfirstproject.service;

import com.micronautfirstproject.models.Person;

import java.util.List;

public interface PersonService {
    void savePerson(Person p);
    List<Person> getAllPerson();
    List<Person> showPersonNameAsc();
    void deletePersonInfo(int id);
}
