package review3;

public class ForLoop {
    public static void main(String[] args) {
        /* repeat block of code
        WHEN we KNOW how many times we will repeat
         for THE MOST POPULAR
         for each/advanced for loop/enhanced for loop

         WHEN we dont know how many times we will repeat the code
         while
         do while
         */

        //1. initialization
        //2. condition
        //3. if true-> code inside the loop body
        //goes back, increment
        //repeat
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Hello "+i);

        }
        System.out.println("___________________");

        for (int a= 0; a < 8; a+=4) {// 0+4+4
            System.out.println("Bye");// 2 bye

        }
        System.out.println("______________");
        for(int b=2;b>10; b++){
            System.out.println("dd");
        }
        for (int s = 3; s < 10; s--) {
            System.out.println(s);// infinite ---

        }
    }
}
