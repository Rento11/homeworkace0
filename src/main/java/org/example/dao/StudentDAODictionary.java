package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDAODictionary implements IStudentDAO {
    public Map<String, Student> studentsMap = new HashMap<>();

    @Override
    public Student addStudent(Student student) {
        studentsMap.put(student.getId(), student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    @Override
    public Student updateStudent(String id, Student newStudent) {
        studentsMap.put(id, newStudent);
        return newStudent;
    }
}
