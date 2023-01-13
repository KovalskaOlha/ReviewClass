package review2;

public class IfElse {
    public static void main(String[] args) {
        /*

        if(boolean condition){
         code A
        } else {
        code B
        }
         */

        int num=12;
        if(num>100){  //because of false condition block B is printed
            System.out.println(num+" is greater than 100");
        } else {
            System.out.println(num+ " is less");
        }

        String expectedButton="Enroll today";  //lowercase  sensitive to lower and uppercase
        if(expectedButton.equals("Enroll Today")){
            System.out.println("Test Case Pass"); //if true-if statement; if false-else
        }else{
            System.out.println("Test Case Failed");
        }
}}
