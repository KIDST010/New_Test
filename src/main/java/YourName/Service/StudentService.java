package YourName.Service;

import YourName.Dao.FakeStudent_daoimpl;
import YourName.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;
@Service
public class StudentService {
    @Autowired
    private FakeStudent_daoimpl fakeStudent_daoimpl;
    public Collection<Student> getAllStudents(){
        return fakeStudent_daoimpl.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.fakeStudent_daoimpl.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.fakeStudent_daoimpl.deleteStudentById(id);
    }
    public void updateStudent(Student student){
        this.fakeStudent_daoimpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.fakeStudent_daoimpl.insertStudent(student);
    }
}
