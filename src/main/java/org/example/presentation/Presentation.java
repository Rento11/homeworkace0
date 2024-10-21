package org.example.presentation;

import org.example.dao.IStudentDAO;
import org.example.dao.Student;
import org.example.dao.StudentDAO;
import org.example.dao.StudentDAODictionary;
import org.example.metier.StudentManager;

public class Presentation {
    public static void main(String[] args) {
        IStudentDAO studentDAO = new StudentDAO();
        IStudentDAO studentDAO2 = new StudentDAODictionary();
        StudentManager studentManager = new StudentManager(studentDAO);

        Student student1 = new Student("1","Mohamed","M1","mohamed@gmail.com");
        Student student2 = new Student("2","Salim","M2","salim@gmail.com");
        Student student3 = new Student("3","Anass","M3","anass@gmail.com");
        Student student4 = new Student("4","Hamid","M4","hamid@gmail.com");

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        System.out.println(studentManager.getAllStudents());

        Student updatedStudent =  new Student("3","Imad","M3.1","imad@gmail.com");
        studentManager.updateStudent("3",updatedStudent);

        System.out.println(studentManager.getAllStudents());

        studentManager = new StudentManager(studentDAO2);
        Student updatedStudent2 =  new Student("1","Mehdi","M.","mehdi@gmail.com");
        studentManager.updateStudent("1",updatedStudent2);
        for (Student student:studentDAO2.getAllStudents()){
            System.out.println(student);
        }

    }
}
