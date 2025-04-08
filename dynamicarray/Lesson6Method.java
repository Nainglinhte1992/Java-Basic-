package com.dynamicarray;

import java.util.Scanner;

public class Lesson6Method {
 /*
 What is Method?
 method vs function
  */
    // file system
    //pre_defined method
    // user defined method

    void  myMethod () {
        System.out.println("My Method");
        System.out.println("My Method");
        System.out.println("My Method");
    }

    //oop
    //instance method // non-static method
    //static method

    void display (){
        System.out.println("My Method");
    }

    static void show(){
        System.out.println("Hello World");
    }

    // return
    //has return , not return

    static String returnName(){
        return "Hello World";
    }
   static int returnAge(){
        return 20;
   }
   static boolean returnBoolean(){
        return true;
   }
   static char workAndThenReturn(){
        char ch = 57+40;
        return ch;
   }

   static  int userdata(){
       System.out.println("Enter your Data:");
       int userInput = new Scanner(System.in).nextInt();
        return userInput*2;
   }
   //static Method
   public static void main(String[] args) {
//       System.out.println(workAndThenReturn());
       System.out.println(userdata());
   }

}
