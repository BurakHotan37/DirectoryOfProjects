package noneGroup.TestBackend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class PersonConfig
{
    @Bean

     CommandLineRunner commandLineRunner(PersonRepository repository)
    {
        return args -> {
           Person max = new Person(1L,23,"MM@outlook.de", "Max", "Mastermind");
                   Person maria =  new Person(2L,23,"MM@outlook.de", "Maria", "Mastermind");

        repository.saveAll(List.of(max, maria));
        };


    }
}
