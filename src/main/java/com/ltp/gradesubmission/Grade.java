package com.ltp.gradesubmission;

public class Grade {
  private String student;
  private String subject;
  private String score;


  public Grade() {
    this.student = "unknown";
    this.subject = "unknown";
    this.score = "unknown";
  }

  public Grade(String student, String subject, String score) {
    this.student = student;
    this.subject = subject;
    this.score = score;
  }


  public String getStudent() {
    return this.student;
  }

  public void setStudent(String student) {
    this.student = student;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getScore() {
    return this.score;
  }

  public void setScore(String score) {
    this.score = score;
  }

}
