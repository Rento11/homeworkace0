package org.example.metier;


import org.example.dao.IStudentDAO;
import org.example.dao.Student;
import org.example.dao.StudentDAO;

import java.util.List;

public class StudentManager {
    public IStudentDAO studentDAO;

    public StudentManager(IStudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }

    public Student addStudent(Student student) {
        for (Student s : studentDAO.getAllStudents()) {
            if (s.email.equals(student.email)) {
                throw new RuntimeException("Email already exists");
            }
        }
        studentDAO.addStudent(student);
        return student;
    }

    public List<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public Student updateStudent(String id, Student newStudent){
        return studentDAO.updateStudent(id,newStudent);
    }
}
