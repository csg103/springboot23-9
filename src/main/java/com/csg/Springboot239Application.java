package com.csg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot239Application implements CommandLineRunner {
	@Autowired
	private HelloWorldService helloWorldService;
	public static void main(String[] args) {
		SpringApplication.run(Springboot239Application.class, args);
	}
	@Override
	public void run(String... args) {
		System.out.println(this.helloWorldService.getMessage());
		if (args.length > 0 && args[0].equals("exitcode")) {
			throw new ExitException();
		}
	}
}
