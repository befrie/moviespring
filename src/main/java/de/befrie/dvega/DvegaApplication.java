package de.befrie.dvega;

import de.befrie.dvega.config.MovieProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(MovieProperties.class)
public class DvegaApplication {

	@Autowired
	private MovieProperties movieProperties;

	public static void main(String[] args) {

		SpringApplication.run(DvegaApplication.class, args);
	}

	@Bean
	@Profile("dev")
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Wert: " + movieProperties.getWelcomeMessage());
		};
	}
}
