package review4;

public class ForLoop {
    public static void main(String[] args) {
        //when we know the numbers of repetition of code

        for (int i = 2; i <=20; i+=5) {
            System.out.println(i);
        }

        System.out.println("*************");
        // 2 keywords that we can use with for loop
        // BREAK and CONTINUE
        for (int i = 2; i <=20; i+=5) {
            System.out.println(i);
            if(i==12) {
                System.out.println("Breaking the loop");
                break;
            }
        }
        //continue-skips current iteration

        for (int i = 1; i <=10; i++) {

            if(i%3==0){
                System.out.println(i);
                continue;//java goes back to the beginning of the loop
            }
            System.out.println("Hello");

        }
    }
}
