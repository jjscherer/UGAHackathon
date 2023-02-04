package com.example.StudentFinderDirectory;
 
import java.util.List;
//import com.example.StudentFinderDirectory.File;
 
public interface FileService {
    List<File> getAllFiles();
    void saveAllFilesList(List<File> fileList);
}