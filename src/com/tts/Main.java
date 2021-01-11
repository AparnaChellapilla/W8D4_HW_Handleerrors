package com.tts;
import java.util.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //public static String main(String[] args) { //missing return statement

    // primitive data types
    int a = 50;
    char b = '6';
    //char b =6;//variable b is defined as string;
    long c = 100000l;
    double d = 4.567; //double is 64 bit precision and holds number with decimal point
    byte e = 127;//incompatible types:possible lossy conversion 8 bit signed value , -128 to 127
    float f = 199.99f;
    //float f = 199.99; // float is a 32 bit precision & declare a number float followed by f
    boolean flag = true;
    byte b1 = (byte) 2321;
    String[] stringArray = new String[2];

    //Reading variables
    System.out.println("Hello World");
    // System.out.println('Hello World'); - unclosed character literal
    System.out.println("This is an integer: " + a);
    //    System.out.println("This is an integer %i", +a); //no suitable method found for println
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(b1);

   /* //for loop to read array
    for(int i =0;i < stringArray.length;i++) {

      System.out.println(stringArray[0]);
      System.out.println(stringArray[1]);
    }
*/

    /*Scanner input = new Scanner(System.in);
    //System.out.printf("Hello World!\n");
    //System.out.printf("Today is awesome!\n");
    System.out.println("What is your name?");
    String firstName = input.nextLine();
    System.out.println("Enter Your Last name:");
    String lastName = input.nextLine();
    System.out.printf("Hello %s %s!\n" ,firstName,lastName);
    System.out.printf("Goodbye %s!\n", firstName);
*/


      /*  String exclaim = addExclamationPoint("Here You go");
        System.out.println(exclaim);*/

    //non-primitive data types
/*
        String name = "Emily";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }*/

    /*public static String addExclamationPoint(String s) {
        // System.out.println(s + "!");
        return s + "!";
    }*/

  }
}
//class,interface or enum expected

