package ke.natujenge.java.generics.jpasample;

import ke.natujenge.java.generics.jpasample.dto.Employee;
import ke.natujenge.java.generics.jpasample.dto.FootballPlayer;
import ke.natujenge.java.generics.jpasample.dto.Student;

public class RepositoryTest {
    public static void main(String[] args) {
        Student peter = new Student("CS-281-0672/2013", "Peter Mutisya");
        Student ericOtieno = new Student("CS-281-0682/2013", "Eric Otieno");
//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.save(peter);

        Repository<Student, String> studentRepositoryUsingGenerics = new Repository<>();
        studentRepositoryUsingGenerics.saveObject(ericOtieno.getRegistrationNumber(), ericOtieno);
        studentRepositoryUsingGenerics.saveObject(peter.getRegistrationNumber(), peter);

        Employee kamochu  = new Employee(23, "Meliora Technologies. Back End");
        Employee brian  = new Employee(17, "Maseno. Fifa player");
        Repository<Employee, Integer> employeeIntegerRepository = new Repository<>();
        employeeIntegerRepository.saveObject(kamochu.getEmployeeNumber(),  kamochu);
        employeeIntegerRepository.saveObject(brian.getEmployeeNumber(),  brian);

        FootballPlayer pogba = new FootballPlayer(6, "Manchester United");
        FootballPlayer mwita = new FootballPlayer(600, "Never played football. The future");
        Repository<FootballPlayer, Integer> footballPlayerIntegerRepository = new Repository<>();
        footballPlayerIntegerRepository.saveObject(pogba.getJerseyNumber(), pogba);
        footballPlayerIntegerRepository.saveObject(mwita.getJerseyNumber(), mwita);


        System.out.println("All students : "+ studentRepositoryUsingGenerics.getAll());
        System.out.println("All employees : "+ employeeIntegerRepository.getAll());
        System.out.println("All players : "+ footballPlayerIntegerRepository.getAll());
    }
}
