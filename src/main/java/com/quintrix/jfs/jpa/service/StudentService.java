package com.quintrix.jfs.jpa.service;

import com.quintrix.jfs.jpa.entity.Student;

public interface StudentService {
  public Student getStudent(int id);

  public Student addStudent(Student student);
}
