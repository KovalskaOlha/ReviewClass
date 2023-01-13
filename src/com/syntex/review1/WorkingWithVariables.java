package com.syntex.review1;

public class WorkingWithVariables {
    public static void main(String[] args) {
        //create a variable and store value into it
        //declared the variable and initialized it
        int number=10;

        //declared a variable
        int num;//declaration of a variable happens only once
        num=100;//initialize the variable
        num=200;//reassign the value
        System.out.println(num);//200

        boolean hungry=false;
        hungry=true;

        //the most popular datatype
        String myString="Hello";
        String name="Asel";
        String address="123 test Drive";

        System.out.println(myString+" "+name);

        int age=21;
        //Asel is 21 years old
        System.out.println(name+" is "+age+" years old");
        /* if we want to attach String to anything we use +
        and it goes as concatenation
         */

        System.out.println(number+num);//when we have 2 numeric values + acts as addition
        String month="december";
        int day=14;
        System.out.println(day+" "+month);


        char date='1';

        System.out.println(date+day);//63 what is happened behind the scene


    }
}
