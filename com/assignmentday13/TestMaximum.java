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


    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Problem!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxInt(a,b,c);// UC1
    }
}
