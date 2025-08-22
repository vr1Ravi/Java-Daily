package com.example.springsecdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
    List<Student>  students = new ArrayList<>(List.of(
        new Student(1, "Skinny pete", "Java"),
        new Student(1, "Tuco", "Js")
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    @PostMapping("/sudent/add")
    public String postMethodName(@RequestBody Student student) {
        students.add(student);
        return "Added";
    }
    
    
}
