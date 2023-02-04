package com.example.StudentFinderDirectory;
 
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
 
public class File {
    // @Id annotation specifies the
    // primary key of an entity
    @Id 
   
    // @GeneratedValue annotation Provides for the
    // specification of generation strategies
    // for the values of primary keys
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    // @Column annotation specifies
    // the name of the column
    @Column(name = "id")
    long id;
    @Column(name = "name")
    String fileName;
    @Lob
    @Column(name = "content")
    String content;
    @Column(name = "filetype")
    private String fileType;
 
    public File() {
        super();
    }
    public File(String fileName, String content, String fileType) {
        super();
        this.fileName = fileName;
        this.content = content;
        this.fileType = fileType;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getFileType() {
        return fileType;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}