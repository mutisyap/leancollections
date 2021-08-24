package ke.natujenge.java.generics.jpasample.dto;

public class Employee {
    private Integer employeeNumber;

    private String details;

    public Employee(Integer employeeNumber, String details) {
        this.employeeNumber = employeeNumber;
        this.details = details;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", details='" + details + '\'' +
                '}';
    }
}
