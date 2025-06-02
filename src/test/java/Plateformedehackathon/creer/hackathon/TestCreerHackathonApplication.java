package Plateformedehackathon.creer.hackathon;

import org.springframework.boot.SpringApplication;

public class TestCreerHackathonApplication {

	public static void main(String[] args) {
		SpringApplication.from(CreerHackathonApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
