package lorapp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="lorapp.db.repo")
@EntityScan(basePackages="lorapp.db.entity")
@SpringBootApplication
public class LoraRestCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoraRestCoreApplication.class, args);
	}
}
