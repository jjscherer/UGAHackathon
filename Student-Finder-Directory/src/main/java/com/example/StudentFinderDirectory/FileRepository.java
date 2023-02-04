package com.example.StudentFinderDirectory;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
//import com.example.StudentFinderDirectory.File;
import java.util.List;

@Repository
public interface FileRepository extends MongoRepository<File, String> {

    File findItemByName(String name);
    
    List<File> findAll(String fileType);
    
    public long count();

}