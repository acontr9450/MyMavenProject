package com.example;
import org.apache.commons.lang3.StringUtils;

public class MyApp{
    public static void main(String[] args){
        //factorial calculation
        int factorialNumber = 8;
        int factorial = 1;

        for(int i = factorialNumber; i > 0; i--){
            factorial *= i;
        }

        System.out.println("Factorial of " + factorialNumber + "! = " + factorial);
    }
}