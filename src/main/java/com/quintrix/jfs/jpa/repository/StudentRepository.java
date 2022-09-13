package com.quintrix.jfs.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.quintrix.jfs.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
  Student findById(int id);
}
