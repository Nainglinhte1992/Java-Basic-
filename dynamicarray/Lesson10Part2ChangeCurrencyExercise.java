package com.dynamicarray;

import java.util.Random;
import java.util.Scanner;

public class Lesson10Part2ChangeCurrencyExercise {

    static void showCurrencyRate(){
        int dollarRate = new Random().nextInt(5000,5500);
        System.out.println("Dollar Rate: " + dollarRate+ " MMK");
    }


    static void showCurrencyRate(String currencyType){
        if (currencyType.equalsIgnoreCase("MMK")){
            System.out.println("1$ :  5,000 MMK");
        } else if (currencyType.equalsIgnoreCase("Thb")) {
            System.out.println("1$ :  33.58 thb");
        }else if (currencyType.equalsIgnoreCase("SGD")){
            System.out.println("1$ :  1.34 SGD");
        }else {
            System.out.println("This currency type is not exit");
        }
    }


//
    static void changeCurrency(String desiredCurrency, int usdAmount){
        double MMK = new Random().nextInt(5000,5500);
        double Thb = new Random().nextInt(30,40);
        double SGD = new Random().nextInt(2,5);

        if (desiredCurrency.equalsIgnoreCase("Thb")){
            System.out.println(usdAmount + "$ :" + usdAmount*Thb + " " + desiredCurrency);
        }else if (desiredCurrency.equalsIgnoreCase("MMK")){
            System.out.println(usdAmount + "$ :" + usdAmount*MMK + " " + desiredCurrency);
        }else if (desiredCurrency.equalsIgnoreCase("SGD")){
            System.out.println(usdAmount + "$ :" + usdAmount*SGD + " " + desiredCurrency);
        }else {
            System.out.println("This currency type is not exit");
        }
    }
//
    private static void startProgram(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select: ");
        System.out.println("1- Show currency");
        System.out.println("2- Change currency");
        System.out.println("3- exit");
        System.out.print("Enter an option you want to do: ");

        int  userInput = scanner.nextInt();
        if (userInput == 1){
            System.out.print("Enter currency type: ");
            Scanner scanner1 = new Scanner(System.in);
            String currencyType = scanner1.nextLine();
            showCurrencyRate(currencyType);
        }else if (userInput == 2){
            System.out.print("Enter currency type change: ");
            Scanner scanner2  = new Scanner(System.in);
            String toCurrencyType = scanner2.nextLine();
            System.out.print("Enter USD Amount you want to change: ");
            Scanner scanner3 = new Scanner(System.in);
            int usdAmount = scanner3.nextInt();
            changeCurrency(toCurrencyType, usdAmount);
        }
    }


    public static void main(String[] args) {

//        showCurrencyRate();

//        showCurrencyRate("MMK");
//        showCurrencyRate("Thb");
//        showCurrencyRate("SGD");

//        changeCurrency("MMK", 50);
//        changeCurrency("SGD", 2);
//        changeCurrency("Thb", 30);

        startProgram();


    }
}
