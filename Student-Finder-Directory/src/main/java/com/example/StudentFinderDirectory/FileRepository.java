package com.example.StudentFinderDirectory;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.StudentFinderDirectory.File;
import java.util.List;

@Repository
public interface FileRepository extends MongoRepository<File, String> {

    @Query("{name:'?0'}")
    File findItemByName(String name);
    
    @Query(value="{category:'?0'}")
    List<File> findAll(String fileType);

}