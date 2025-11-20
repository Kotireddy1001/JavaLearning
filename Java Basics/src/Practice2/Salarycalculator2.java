package Practice2;

import java.util.Scanner;

public class Salarycalculator2 {
    public static void main(String args[]){
        Scanner Sc=new Scanner (System.in);

        System.out.println("what is your name ");
        String name=Sc.nextLine();

        System.out.println("enter hourly wage ");
        double wage=Sc.nextDouble();

        System.out.println("enter how many hours you worked");
        double hours=Sc.nextDouble();

        double pay=wage*hours;
        System.out.printf("Employee: %s\n TotalSalary %2f\n",name,pay);


    }
}
