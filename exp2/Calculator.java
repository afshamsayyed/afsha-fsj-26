/*Name= Afsha sayyed
AIM = WAP to create a program demonstrating hierarchical inheritance using a base class
Shape and derived classes Rectangle and Circle. Calculate the area of each shape and
use exception handling to display an appropriate message if the user enters negative dimension or invalid input
Class = SE/A */

public class Calculator {

    int a;
    int b;

    Calculator() {
        a = 0;
        b = 0;
    }

    Calculator(int i, int j) {
        a = i;
        b = j;
    }

    void add(int p, int q) {
        int sum = p + q;
        System.out.println("add : " + sum);
    }

    void add(double p, double q) {
        double sum = p + q;
        System.out.println("add : " + sum);
    }

}
