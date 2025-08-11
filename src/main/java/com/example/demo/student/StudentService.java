package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getstudents(){
        return List.of(
                new Student(
                        1L, LocalDate.of(2004, Month.JANUARY,9),
                        "rharish0909@gmail.com",
                        "Harish",
                        21));
    }
}
