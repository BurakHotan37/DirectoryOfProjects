package com.example.SpringSecurity.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
public class PersonController
{
    private static final List<Person> PERSON = Arrays.asList(
            new Person(1, "Any name"),
            new Person(2, "Any "),
            new Person(3, "name")

    );

    @GetMapping(path = "{id}")
    public Person getPerson(@PathVariable("id") Integer id)
    {
        return  PERSON.stream()
                .filter(person -> id.equals(person.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Name" + id + "does not exists"));
    }
}
