package com.quintrix.jfs.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.jfs.jpa.entity.Student;
import com.quintrix.jfs.jpa.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student getStudent(int id) {
    try {
      return studentRepository.findById(id);
    } catch (RuntimeException e) {
      e.setStackTrace(null);
    }
    return null;
  }

  @Override
  public Student addStudent(Student student) {
    return studentRepository.save(student);
  }

}
