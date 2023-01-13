package review2;

public class IfStatement {
    public static void main(String[] args) {
        //if statement is conditional statement
        //if=true
        //else==false
        //based on condition will perform diff actions
        // if is a keyword & they have a special meanings for Java
        //if(boolean condition){block of code}
        // >  >=  <= !=  ==  Relational operators to perform condition
        int day=2;    // =  assign
        if(day==1){   //   == relational operator
            System.out.println("It is the first day of the month");
        }

        String month="December"; //every value we have to store in diff datatype
        if(month.equals("December")){ //with String we can == just .equals("")
            System.out.println("It is Christmas time");
        }

        boolean evening= true;// with boolean we don't need to use ==
        if(evening){
            System.out.println("I might have a class at Syntax");
        }
    }
}
