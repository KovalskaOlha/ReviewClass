package review4;

public class LoopsPractice {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);//0 1 2 3
            for (int j = 1; j >=3; j++) {//inner loop will not work because of condition
                System.out.println(j);

            }
        }
        System.out.println("*********");
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <=3; j++) {//inner loop will not work because of condition
                System.out.print(i);//000 111 222 333


            }
            System.out.println();
        }
        System.out.println("_______________");
//0000 0001 0002 0003 0004 ....9999
        for (int i = 0; i <=9; i++) {
            for (int j = 0; j <=9; j++) {
                for (int k = 0; k <=9; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        System.out.println(i+" "+j+" "+k+" "+l);
                    }

                }
            }

        }
    }
}
