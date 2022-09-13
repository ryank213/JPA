package com.quintrix.jfs.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.jpa.entity.Student;
import com.quintrix.jfs.jpa.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/{id}")
  public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
    Student student;
    try {
      student = studentService.getStudent(id);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
    return ResponseEntity.ok(student);
  }

  @PostMapping
  public ResponseEntity<Student> addStudent(@RequestBody Student student) {
    return ResponseEntity.ok(studentService.addStudent(student));
  }
}
