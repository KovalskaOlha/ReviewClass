package review4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //while loop when we dont know how many time we need to repeat rhe code
        int a=1;
        while (a<=3){
            System.out.println("I'm while loop");
            a++;
        }
        //while or do while
        int b=1;

        do{
            System.out.println("do while");
            b++;
        }while (b>=3);

        //Ask students if they understand loops?
        //if they dont -->tell them to practice

        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java?");
            answer = scan.nextLine();
        }while(!answer.equalsIgnoreCase("yes"));
        System.out.println("Great job! Let's learn arrays now");
    }
}
