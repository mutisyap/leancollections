package ke.natujenge.java.generics.jpasample;

import ke.natujenge.java.generics.jpasample.dto.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private final Map<String, Student> studentMap = new HashMap<>();

    public void save(Student student){
        studentMap.put(student.getRegistrationNumber(), student);
    }
}
