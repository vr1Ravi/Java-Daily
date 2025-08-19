package com.example.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjdbc.model.Student;
import com.example.springjdbc.repository.StudentRepository;

@Service
public class StudentService {
    

   
    private StudentRepository repo;
    public void addStudent(Student st){
        System.err.println("Operating student");
        repo.save(st);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public StudentRepository getRepo() {
        return repo;
    }
     @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }
}
