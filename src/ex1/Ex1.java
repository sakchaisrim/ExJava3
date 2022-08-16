package ex1;

import java.util.Scanner;

class Employee{
    protected float rate = 300.0f;
}
class Daily_emp extends Employee{

}
class Monthly_emp extends Employee{

}
public class Ex1 {
    public static void main(String[] args) {
        float r;
        Employee emp1 = new Employee();
        System.out.println("\"Employee\"\nRate per Day= "+emp1.rate+"บาท");

        System.out.print("\"Daily Employee\"\nEnter Rate= ");
        Scanner scan = new Scanner(System.in);
        r = scan.nextFloat();

        Daily_emp emp2 = new Daily_emp();
        emp2.rate = r;
        System.out.println("Rate per Day= "+emp2.rate+"บาท");

        System.out.print("\"Monthly Employee\"\nEnter Salary= ");
        r = scan.nextFloat();

        Monthly_emp emp3 = new Monthly_emp();
        emp3.rate = r;
        System.out.println("Rate per Day= "+emp3.rate/30 +"บาท");

    }
}
