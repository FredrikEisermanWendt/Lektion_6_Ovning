package com.Fredrik.demo;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4};

        try {
            for (int i = 0; i < intArr.length + 1; i++) {
                System.out.println(intArr[i]);
            }
        }catch(Exception e){
            System.out.println("Error, for loopen räddad!");
        }

        try {
            if (intArr[intArr.length + 1] == 0){
                System.out.println(true);
            }
        }catch(Exception e){
            System.out.println("Där räddades if satsen");
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
