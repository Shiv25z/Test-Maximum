package com.assignmentday13;

import java.util.Scanner;

public class TestMaximum {
    public static Integer compareTo(Integer a, Integer b, Integer c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static Float compareTo(Float a, Float b, Float c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static String compareTo(String str1, String str2, String str3) {
        if (str1.compareTo(str2) > 0) {
            if (str1.compareTo(str3) > 0) {
                return str1;
            } else {
                return str3;
            }
        } else {
            if (str2.compareTo(str3) > 0) {
                return str2;
            } else {
                return str3;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Problem!");

        System.out.println("Maximum from 3 Integer: " + compareTo(19, 12, 20));
        System.out.println("Maximum from 3 Float : " + compareTo(19.0F, 12.0F, 20.0F));
        System.out.println("Maximum from 3 String : " + compareTo("Apple", "Peach", "Banana"));
    }
}
