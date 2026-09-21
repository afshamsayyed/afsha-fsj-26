/*
Aim : Programs on various types of inheritance and Exception handling
UIN : 251P062
Name : Afsha
Roll no. : 46
Batch : B2
*/

public class Employee extends Person {
    
    // Data members of Employee class
    private double salary;
    private String position;
    private String emp_code;
    private int experience;

    // Constructor to initialize Employee details
    Employee(String name, String gender, int age, int mobile, double salary, String position, String emp_code, int experience) {
        super(name, gender, age, mobile);
        this.salary = salary;
        this.position = position;
        this.emp_code = emp_code;
        this.experience = experience;
    }
    
    // Method to display Employee details
    void display() {
        super.display(); // Call display method of Person class
        System.out.println("Salary : " + this.salary);
        System.out.println("Position :" + this.position);
        System.out.println("emp_code : " + this.emp_code);
        System.out.println("Experience : " + this.experience);
    }
}
