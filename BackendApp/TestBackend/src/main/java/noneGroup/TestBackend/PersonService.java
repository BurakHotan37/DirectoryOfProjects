package noneGroup.TestBackend;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PersonService
{
    @GetMapping
    public List<Person> getPerson()
    {
        return List.of(new Person(1,"Max", "Mustermann", 23, "MM@outlook.de"));

    }


}
