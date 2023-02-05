package com.DawgDirectory.demo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Syllabus {
    @Id
    private String profName;
    private String courseNum;
    private String courseTitle;
    private Semester semester;
    private int year;
    @Indexed(unique = true)

    private String classString = this.toString();

    public Syllabus(String profName, String courseNum, String courseTitle, Semester semester, int year) {
        this.profName = profName;
        this.courseNum = courseNum;
        this.courseTitle = courseTitle;
        this.semester = semester;
        this.year = year;
    }
}
