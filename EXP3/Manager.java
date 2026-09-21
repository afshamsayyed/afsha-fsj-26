/*
Aim : Programs on various types of inheritance and Exception handling
UIN : 251P062
Name: Afsha
Roll no. : 46
Batch : B2
*/

public class Manager extends Employee {
    
    // Department of the Manager
    String department = "Data Engineering";

    // Constructor to initialize Manager details
    Manager(String name, String gender, int age, int mobile, double salary, String position, String emp_code, int experience, String department) {

        super(name, gender, age, mobile, salary, position, emp_code, experience);
        this.department = department;

    }
    
    // Method to display Manager details
    void display() {
        super.display(); // Call display method of Employee class
        System.out.println("Department : " + this.department);
    }
}
