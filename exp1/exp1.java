/*AIM:Programs on classes and objects.
Coder:Afsha
Class:S.E COMPS A */

public class exp1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Afsha";
        s1.uin = "251P062";
        s1.cgpa = 8.8;
        s1.display();

        student s2 = new student();
        s2.name = "Hasan";
        s2.uin = "251P029";
        s2.cgpa = 8.5;
        s2.display();
    }
}
/**
 * student
 */
 class student {
    String name;
    String uin;
    double cgpa; 

    void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student uin: "+uin);
        System.out.println("Student cgpa: "+cgpa);
    }

    
}
