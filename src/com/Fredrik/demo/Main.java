package com.Fredrik.demo;

public class Main {
    public static void main(String[] args) {

        /* TODO
         *   Change the names of files + packages to relevant names
         *   Find the errors in the code and resolve it!
         */

    Student student = new Student(15);
    student.sayHello("Kalle");

    runMyForLoop();

    }




    public static void runMyForLoop() {
        for (int i = 0; i < 5; i++){
            System.out.println("Inside the method runMyForLoop" + i);
        }

    }
}
