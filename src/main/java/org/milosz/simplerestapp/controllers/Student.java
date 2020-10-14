package org.milosz.simplerestapp.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Student {
    private  String name;
    private  String secondName;
    private  int age;
}
