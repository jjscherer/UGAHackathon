package com.DawgDirectory.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SyllabusRepository extends MongoRepository<Syllabus, String> {

}
