package YourName.Dao;

import YourName.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.*;
@Repository
public class FakeStudent_daoimpl {
    private static Map <Integer, Student> students;
    static{
        students=new HashMap<Integer,Student>(){
            {
                put(1,new Student(1,"kidst","Mpp"));
                put(2,new Student(2,"kid","Mpp"));
                put(3,new Student(3,"kids","Mpp"));


            }
        };
    }



    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }


    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student){
        Student s=students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }

    public void insertStudent(Student student) {
       this.students.put(student.getId(),student);
    }

}
