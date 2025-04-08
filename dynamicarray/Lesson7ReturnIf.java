package com.dynamicarray;

import java.util.Scanner;

public class Lesson7ReturnIf {

    static String Validate() {
        System.out.print("Enter Your Age: ");
        int userInput = new Scanner(System.in).nextInt();

//        if(userInput < 18){
//            return "can't";
//        }else {
//            return "can";
//        }
        if (userInput < 18) return "can't";
        return "can";
    }

    static void ValidateWithoutReturn() {
        System.out.print("Enter Your Age: ");
        int userInput1 = new Scanner(System.in).nextInt();

        if (userInput1 < 18) {
            System.out.println("You can't Vote");
        } else {
            System.out.println("You can Vote");
        }
    }

    public static void main(String[] args) {
        ValidateWithoutReturn();
    }
}






