package Practice2;

import java.util.Scanner;

public class Salarycalculator {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);

        System.out.print("Enter employee name \n");
        String name=Sc.nextLine();

        System.out.print("enter hourly wage \n");
        double wage=Sc.nextDouble();

        System.out.print("total hours worked \n");
        double hours=Sc.nextDouble();

        double pay=wage*hours;
        System.out.printf("Employee: %s\n Total Salary: %2f\n",name,pay);
    }
}
