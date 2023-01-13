package review2;

public class ifElseIf {
    public static void main(String[] args) {
        /* with many condition we use if else is
        if(boolean condition){
        code A
        } else if(boolean condition){
        code B
        } else if(boolean condition){
        code C
        }

        If you completed more than 25 -> great job
        if you completed more than 20 ->good job
        if you complete more than 10-> ok job
        if you complete more than 5-> not good job

         we select what block will run the java


        */

        int hw = 30;
        if (hw > 25) {
            System.out.println("Great job");
        } else if (hw > 20) {
            System.out.println("Good job");
        } else if (hw > 10) {
            System.out.println("ok job");
        } else if (hw < 5) {
            System.out.println("Not a good job");
        }

        System.out.println("_________________________");

        String browser = "www";
        if (browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test case execute on firefox browser");
        } else { //when none of the condition are true
            System.out.println("Browser is not supported");
        }
    }

}







