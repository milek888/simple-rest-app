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
}
