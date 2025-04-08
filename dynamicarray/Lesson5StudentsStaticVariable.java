package com.dynamicarray;

public class Lesson5StudentsStaticVariable {
    int id;

    String name;

    int age;

    static String schoolName = "Code Wall";

    public static void main(String[] args) {
        Lesson5StudentsStaticVariable student = new Lesson5StudentsStaticVariable();
        student.id = 1;
        student.name = "John";
        student.age = 20;

        Lesson5StudentsStaticVariable student2 = new Lesson5StudentsStaticVariable();
        student2.id = 2;
        student2.name = "Jane";
        student2.age = 21;

        System.out.println(student);
        System.out.println(student2);

        Lesson5StudentsStaticVariable.schoolName = "ILBC Institute";

        System.out.println(student.schoolName);
        System.out.println(student2.schoolName);

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
