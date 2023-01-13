package review2;

public class nestedIf {
    public static void main(String[] args) {
        /*

        Nested If is 1 if statement inside another if statement
        when 1 cond depends on another

        */

        boolean vaccine=true;
        int dose=0;
        if (vaccine){  //outer if
            System.out.println("How many dozes you have?");
            if (dose==1){ //inner if (always depends on outer if
                System.out.println("you need second");
            }else{
                System.out.println("you are fully vaccinated");
            }
        }else{
            System.out.println("I don't have a vaccine");
        }
    }
}
