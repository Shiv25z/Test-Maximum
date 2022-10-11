package com.assignmentday13;

import java.util.Scanner;

public class TestMaximum {
    static void maxInt(int a, int b, int c){
        if(a==b||b==c||a==c){
            System.out.println("Two same numbers entered");
        }
        if(a>b&&a>c)
            System.out.println("Maximum : "+a);
        if(b>a&&b>c)
            System.out.println("Maximum : "+b);
        else{
            System.out.println("Maximum : "+c);
        }
    }
    static void maxFloat(float a, float b, float c){
        if(a==b||b==c||a==c){
            System.out.println("Two same numbers entered");
        }
        if(a>b&&a>c)
            System.out.println("Maximum : "+a);
        if(b>a&&b>c)
            System.out.println("Maximum : "+b);
        else{
            System.out.println("Maximum : "+c);
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Problem!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Integers");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        maxInt((int) a,(int)b,(int)c);// UC1
        maxFloat(a, b, c);// UC2
    }
}
