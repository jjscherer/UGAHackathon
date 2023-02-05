package com.DawgDirectory.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import java.util.List;

@SpringBootApplication
public class DawgDirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DawgDirectoryApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(SyllabusRepository repository, MongoTemplate mongoTemplate){
		return args -> {

			/*Syllabus syllabus = new Syllabus("Saleh", "CSCI 4050",
					"Software Engineering", Semester.FALL, 2022);

			repository.insert(syllabus);*/
		};
	}
}
