package com.Fredrik.demo;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4};

        for (int i = 0; i < intArr.length +1; i++){
            System.out.println(intArr[i]);
        }


    }


    public static void tryMethod(){
        try{
            System.out.println(2/0);;
        } catch (Exception e){
            System.out.println("Error");

        }


    }
}
