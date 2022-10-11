package com.assignmentday13;

import java.util.Scanner;

public class TestMaximum {
    public <T extends Comparable<T>> T compareTo(T a,T b,T c) {// UC4
        if(a.compareTo(b) > 0){
            if(a.compareTo(c) > 0) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b.compareTo(c) > 0) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Problem!");
        TestMaximum integerComparison = new TestMaximum();
        System.out.println("Maximum from 3 Integer: " +integerComparison.compareTo(19, 12, 20));
        TestMaximum floatComparison = new TestMaximum();
        System.out.println("Maximum from 3 Float : " +floatComparison.compareTo(19.0F, 12.0F, 20.0F));
        TestMaximum stringComparison = new TestMaximum();
        System.out.println("Maximum from 3 String : " +stringComparison.compareTo("Apple", "Peach", "Banana"));
    }
}
