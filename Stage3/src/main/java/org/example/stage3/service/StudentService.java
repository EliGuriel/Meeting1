package org.example.stage3.service;

import org.example.stage3.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1L, "John", "Doe", 20),
            new Student(2L, "Jane", "Smith", 22),
            new Student(3L, "Emily", "Jones", 19),
            new Student(4L, "Michael", "Brown", 21)
    ));

    public List<Student> getAllStudents() {
        return students;
    }
}
