package org.example.dao;

import java.util.List;

public interface IStudentDAO {
    public Student addStudent(Student student);
    public List<Student> getAllStudents();
    public Student updateStudent(String id, Student newStudent);
}
