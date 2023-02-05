package com.example.StudentFinderDirectory;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentFinderDirectory.File;
import com.example.StudentFinderDirectory.FileRepository;
 
// @Service annotation is used with classes
// that provide some business functionalities
@Service
public class FileServiceImplementation implements FileService {
 
    // @Autowired annotation used to inject
    // the object dependency of FileRepository
    @Autowired 
    FileRepository fileRepository;
   File file = new File();
    @Override
    public List<File> getAllFiles() {
        // fetch all the files form database
        return fileRepository.findAll();
    }
    public void saveAllFilesList(List<File> fileList) {
        // Save all the files into database
        for (File fileModal : fileList)
            fileRepository.save(fileModal);
    }
}