package com.dynamicarray;


public class Lesson9ReturnObject {

    static int number(){
        return 1;
    }
    static String message(){
        return "Hi";
    }
    static Object object()
    {
        return object();
    }

    public static void main(String[] args) {
        int number = 1;
        String message = "Hi";
        Object object = new Object();

        int resultNumber = number();
        String resultString = message();
        Object resultObject = object();
    }

}
