package review3;

public class LogOperator {
    public static void main(String[] args) {

        System.out.println("___________logical AND_______________");
        boolean loginButtonDisplayed= true;
        boolean loginButtonClickable=true;

        if (loginButtonDisplayed && loginButtonClickable){// both condition should be true
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test case failed");
        }
        System.out.println("_____________Logical OR________________");

        boolean dashboard=false;
        String message="Hello";

        if(dashboard || message.equals("Welcome admin")){//one condition should be true
            System.out.println("User is logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("____________logical NOT_________________");
        //reverse the condition

        boolean b=true;
        System.out.println(!true);//false

        boolean agreeCheckBoxSelected=true;  //clicked box
        //  AGREE BUTTON IN CHECKBOX
        if(!agreeCheckBoxSelected){
            System.out.println("I'm clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");

    }
}
