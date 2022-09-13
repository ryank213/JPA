package com.quintrix.jfs.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "students")
@Table(name = "students")
public class Student {
  @Id
  @Column(name = "id")
  private int id;

  private String firstname;
  private String lastname;
  private String email;

  public Student(int id, String firstname, String lastname, String email) {
    super();
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
  }

  public Student() {
    this.id = 0;
    this.firstname = "N/A";
    this.lastname = "N/A";
    this.email = "N/A";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
        + email + "]";
  }
}
