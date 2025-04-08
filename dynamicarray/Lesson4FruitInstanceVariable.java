package com.dynamicarray;

public class Lesson4FruitInstanceVariable {
     String name;
     String color;
     String size;

    public static void main(String[] args) {

        Lesson4FruitInstanceVariable fruit = new Lesson4FruitInstanceVariable();
        fruit.name = "Mango";
        fruit.color = "yellow";
        fruit.size = "Small";

//        System.out.println(fruit);

        Lesson4FruitInstanceVariable fruit2 = new Lesson4FruitInstanceVariable();
        fruit2.name = "Orange";
        fruit2.color = "light yellow";
        fruit2.size = "Medium";
//        System.out.println(fruit2);

        fruit.color = "green";

        System.out.println(fruit);
        System.out.println(fruit2);

    }

    @Override
    public String  toString() {
        return "Fruit {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
