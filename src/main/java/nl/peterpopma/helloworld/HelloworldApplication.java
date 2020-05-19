package nl.peterpopma.helloworld;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(GreetingRepository greetingRepository) {
		return args -> { greetingRepository.save(new GreetingEntity("hallo"));
			greetingRepository.save(new GreetingEntity("hoi"));
		};
	}

}
