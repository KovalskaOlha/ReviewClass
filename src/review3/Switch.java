package review3;

public class Switch {
    public static void main(String[] args) {
        /*
         syntax

         switch(variable){

         case value1:
         codeA;
         break;
         case value2:
         codeB;
         break;
         default:  OPTIONAL
         codeC;
         break;

      */

        int worldCup =2022;

        switch(worldCup){

            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany ");
                break;
            default:
                System.out.println("Winner is unknown");
                break;//optional  we can delete the last break

        }
    }
}
