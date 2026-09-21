/*
Aim : Programs on various types of inheritance and Exception handling
UIN : 251P062
Name : Afsha
Roll no. : 46
Batch : B2
*/

public class Person {
    // Data members of Person class
    private String name;
    private String gender;
    private int age;
    private int mobile;

    // Constructor to initialize Person details
    Person(String name, String gender, int age, int mobile) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
    }

    // Method to display Person details
    void display() {
        System.out.println("name : " + this.name);
        System.out.println("Gender : " + this.gender);
        System.out.println("age : " + this.age);
        System.out.println("mobile : " + this.mobile);
    }
}
