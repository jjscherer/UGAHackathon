package com.DawgDirectory.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SyllabusService {

    private final SyllabusRepository syllabusRepository;

    public List<Syllabus> getAllSyllabi() {
        return syllabusRepository.findAll();
    }
}
