package org.milosz.simplerestapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        Student student = Student.builder()
                .name("Milosz")
                .secondName("Mazurek")
                .age(17)
                .build();
        return student;
    }

    @GetMapping("/student2")
    public Student getStudent2() {
        Student student = Student.builder()
                .name("Milosz2")
                .secondName("Mazurek2")
                .age(172)
                .build();
        return student;
    }
}
