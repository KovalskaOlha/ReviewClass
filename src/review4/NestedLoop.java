package review4;

public class NestedLoop {
    public static void main(String[] args) {
        // loop inside the loop
//inner loop always depends on outer loop
        for (int i = 1; i <= 3; i++) {

            System.out.println(i);
            for (int j = 1; j <=4 ; j++) {
                System.out.println(j);

            }

        }
        System.out.println("________________");
    }
}
