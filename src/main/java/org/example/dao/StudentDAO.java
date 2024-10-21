package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudentDAO {
    public List<Student> students = new ArrayList<>();

    @Override
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student updateStudent(String id, Student newStudent) {
        for(int i=0; i<students.size();i++){
            if(students.get(i).getId().equals(id)){
                students.set(i,newStudent);
                return newStudent;
            }
        }
        return null;
    }
}
