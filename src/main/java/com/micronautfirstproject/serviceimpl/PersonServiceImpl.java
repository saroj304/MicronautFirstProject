package com.micronautfirstproject.serviceimpl;

import com.micronautfirstproject.models.Person;
import com.micronautfirstproject.repository.PersonRepository;
import com.micronautfirstproject.service.PersonService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class PersonServiceImpl implements PersonService {
    @Inject
    PersonRepository prepo;

    @Override
    public void savePerson(Person p) {
        prepo.save(p);
    }

    @Override
    public List<Person> getAllPerson() {
        return prepo.findAll();
    }

    @Override
    public List<Person> showPersonNameAsc() {
        return prepo.displayNameinAsc();
    }

    @Override
    public void deletePersonInfo(int id) {
     prepo.deleteById(id);
    }
}
