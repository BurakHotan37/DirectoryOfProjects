package noneGroup.TestBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "Person")
public class PersonController
{
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPerson()
    {
        return personService.getPerson();
    }

    @PostMapping
    public void  registerNewPerson(@RequestBody Person person)
    {
        personService.addNewPerson(person);
    }

}
