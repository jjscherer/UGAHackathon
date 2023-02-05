package com.example.StudentFinderDirectory;

import org.springframework.data.mongodb.repository.MongoRepository;

public class SimpleMongoRepository implements MongoRepository<File, String>{
    private FileRepository repo;

    public void addFile(File file) {
        repo.insert(file);
    }

    public void saveAll(File file) {
        repo.
    }
}
