package com.StudentLogin.StudentLogin.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.StudentLogin.StudentLogin.Service.StudentService;
import com.StudentLogin.StudentLogin.entity.Student;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{studentName}")
    public void updateStudent(@PathVariable String studentName, @RequestBody Student student) {
        // Set the name of the student to be updated
        student.setName(studentName);
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{studentName}")
    public void deleteStudent(@PathVariable String studentName) {
        studentService.deleteStudent(studentName);
    }
}
