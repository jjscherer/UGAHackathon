package com.DawgDirectory.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("Syllabus")
@AllArgsConstructor
public class SyllabusController {
    private final SyllabusService syllabusService;

    @GetMapping
    public List<Syllabus> fetchAllSyllabi() {
        return syllabusService.getAllSyllabi();
    }

}
