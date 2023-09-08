package com.micronautfirstproject.controllers;

import com.micronautfirstproject.models.Person;
import com.micronautfirstproject.serviceimpl.PersonServiceImpl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Inject
    @SuppressWarnings("unused")
    PersonServiceImpl personimpl;

    @Post("/savedata")
//    save the data in json format by default
    @Consumes
    public void savePersonInfo(@Body Person p) {
        log.debug(p.getName());
        personimpl.savePerson(p);
    }

    @Get(value = "/getPersons", produces = MediaType.TEXT_XML)
    public List<Person> getAllPerson() {
        return personimpl.getAllPerson();
    }

    @Get("/displaynameinasc")
    public List<Person> getAllPersonInAsc() {
        return personimpl.showPersonNameAsc();
    }

    @Delete("/deletePerson/{id}")
    public void deletePerson(@PathVariable int id) {
        personimpl.deletePersonInfo(id);
    }
}