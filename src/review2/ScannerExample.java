package review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int in=10;
        Scanner keyboard=new Scanner(System.in);//non-primitive datatype

        System.out.println("enter your age");
        int age =keyboard.nextInt();
        System.out.println("are you tired?");
        boolean tired =keyboard.hasNextBoolean();
        System.out.println("what is your name?");
        String name= keyboard.next(); // to capture the String until space

    }
}
