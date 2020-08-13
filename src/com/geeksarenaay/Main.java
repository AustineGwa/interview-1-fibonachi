package com.geeksarenaay;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int firstNum = 1;
        int secondNum = 1;
        int nextNumber;

        for(int i=0; i<=20; i++){
           nextNumber = firstNum + secondNum;
            System.out.print(nextNumber + ", ");
           firstNum = secondNum;
           secondNum =nextNumber;

        }



    }
}
