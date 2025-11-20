package Practice2;

import java.util.Scanner;

public class Userinput1 {
    public  static void main(String args[]) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("what is your Name? ");
        String name = Scanner.nextLine();
        System.out.printf("Hey %s, How are you? \n", name);
        String status = Scanner.nextLine();
        System.out.println("what is your age ");
        int age=Scanner.nextInt();
        System.out.print("Thank you for information");
       }
    }
