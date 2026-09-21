/*
Aim : Programs on various types of inheritance and Exception handling
UIN : 251P062
Name : Afsha
Roll no. : 46
Batch : B2
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        try {
            // Create Scanner object to take input from user
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter name : ");
            String name = sc.nextLine();

            System.out.print("Enter age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender : ");
            String gender = sc.nextLine();

            System.out.print("Mobile : ");
            int mobile = sc.nextInt();
            sc.nextLine();

            System.out.print("Salary : ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Position : ");
            String position = sc.nextLine();

            System.out.print("emp_code : ");
            String emp_code = sc.nextLine();

            System.out.print("Experience : ");
            int experience = sc.nextInt();
            sc.nextLine();

            System.out.print("Department : ");
            String department = sc.nextLine();

            // Create Manager object with given details
            Manager m1 = new Manager(name, gender, age, mobile, salary, position, emp_code, experience, department);

            // Display manager details
            System.out.println("\n---------------- OUTPUT ----------------");
            m1.display();

            sc.close();

        } catch (InputMismatchException e) {
            // Handles invalid integer input
            System.out.println("Enter integer only");

        } catch (Exception e) {
            // Handles other invalid inputs
            System.out.println("Invalid input");
        }

    }
}
