package noneGroup.TestBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class TestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestBackendApplication.class, args);
	}



}
