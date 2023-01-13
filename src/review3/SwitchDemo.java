package review3;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your Browser");
        String browser=sc.nextLine();
        switch (browser.toLowerCase()){
            case"chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "microsoft":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown");
        }
    }
}
