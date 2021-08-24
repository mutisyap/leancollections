package ke.natujenge.java.generics.jpasample.dto;

public class Student {

    private String registrationNumber;

    private String details;

    public Student(String registrationNumber, String details) {
        this.registrationNumber = registrationNumber;
        this.details = details;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Student{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
