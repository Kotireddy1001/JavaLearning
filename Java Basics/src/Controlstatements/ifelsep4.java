package Controlstatements;

public class ifelsep4 {
    public static void main(String[] args){
        int age=35;
        boolean iscitizen=true;

        if(age>=18 && iscitizen){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
}
