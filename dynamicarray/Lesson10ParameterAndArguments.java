package com.dynamicarray;

public class Lesson10ParameterAndArguments {
    static  void  calculateByParameter(int number){
        System.out.println(number*10);
    }

    static void makeFriedRice(String meatType, boolean onionInclude, boolean sauceInclude) {

        if (meatType != null) {
            if (onionInclude) {
                if (sauceInclude) {
                    System.out.println( meatType + " Fired Rice With onionInclude And sauceInclude");
                } else {
                    System.out.println( meatType + " Fired Rice With onionInclude");
                }
            } else {
                if (sauceInclude) {
                    System.out.println(meatType + " Fired Rice With sauceInclude");
                } else {
                    System.out.println( meatType + " Fired Rice ");
                }
            }
        } else {
            if (onionInclude) {
                if (sauceInclude) {
                    System.out.println("Fired Rice With onionInclude And sauceInclude");
                } else {
                    System.out.println("Fired Rice With onionInclude");
                }
            } else {
                if (sauceInclude) {
                    System.out.println("Fired Rice With sauceInclude");
                } else {
                    System.out.println("Fired Rice ");
                }
            }
        }

    }

    public static void main(String[] args) {
//        calculateByParameter(5);
//        calculateByParameter(4);
//        calculateByParameter(1);

        makeFriedRice("chicken", true, false);
        makeFriedRice("Beef", false, true);
        makeFriedRice("Pork", true, true);
        makeFriedRice("Pork Rib", true, true);
        makeFriedRice("Egg", true, true);
        makeFriedRice(null, true, true);

    }
}
