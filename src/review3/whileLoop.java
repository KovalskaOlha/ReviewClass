package review3;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=4){
            System.out.println("hello");
            i++;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("are you tired");
        boolean tired= sc.nextBoolean();
        while(!tired){
            System.out.println("this is great");
            System.out.println("lets study java");
            System.out.println("are you tired?");
            tired=sc.nextBoolean();// use to stop the loop for a question

        }
    }
}
