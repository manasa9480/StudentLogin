package com.StudentLogin.StudentLogin.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.StudentLogin.StudentLogin.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        logger.info("Fetching all students");
        return students;
    }

    public Student createStudent(Student student) {
        students.add(student);
        logger.info("Created new student: {}", student);
        return student;
    }

    public void updateStudent(Student student) {
        students.removeIf(s -> s.getName().equals(student.getName()));
        students.add(student);
        logger.info("Updated student: {}", student);
    }

    public void deleteStudent(String studentName) {
        students.removeIf(s -> s.getName().equals(studentName));
        logger.info("Deleted student with name: {}", studentName);
    }
}
