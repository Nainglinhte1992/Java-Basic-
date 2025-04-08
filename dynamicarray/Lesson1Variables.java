package com.dynamicarray;

public class Lesson1Variables {

    // global variable // properties // attributes // state // field // data members // identifier
    int instanceVar = 6; // instance variable

    static int staticVar = 50; // static variable

    {
        int a = 7; // local variable
        System.out.println(a);
    }

    public static void main(String[] args) {
        int b = 10;
        System.out.println(b);

        // objective create --> className(or)type+objectiveName = new +className(or)type();
        Lesson1Variables objectiveName = new Lesson1Variables();
        System.out.println(objectiveName.instanceVar); // objectiveName. call


        System.out.println(Lesson1Variables.staticVar); // className. call
        System.out.println(staticVar);
    }
}
