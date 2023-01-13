package review3;

public class LogicalOperators {
    public static void main(String[] args) {
        //  &&  ||  !
        // Ande OR NOT

        boolean cold=true;// true && true = true
        boolean rain=true;
        if (cold && rain){// for && both condition should be true
            System.out.println("I will stay at home");
        }

        //  OR
        // one of the condition is true--true

        if(cold || rain){
            System.out.println("I will stay home");
        }
    }
}
