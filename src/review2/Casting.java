package review2;

public class Casting {
    public static void main(String[] args) {
        /*casting is a convert 1 datatype into another
         1) widening/implicit/automatic
         (byte->short->int->long->double) from small to big

         2)narrowing/explicit/manual
         (double->float->long->int->short->byte)

         */
           //widening
        double d=5;//5.0 implicit automatically
        System.out.println(d);

        //narrowing
        int i=(int)5.0;//5 explicit and manual
        System.out.println(i);

        int num=128;
        byte b=(byte)num;//from int to byte
        System.out.println(b);


    }
}
