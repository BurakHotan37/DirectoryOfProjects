package noneGroup.TestBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService
{
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getPerson()
    {
        return personRepository.findAll();
        //List.of(new Person(1,"Max", "Mustermann", 23, "MM@outlook.de"));
    }


    public void addNewPerson(Person person)
    {
        System.out.println(person);
    }
}
