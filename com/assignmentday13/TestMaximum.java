package com.assignmentday13;



public class TestMaximum <T extends Comparable<T>> {

        T a,b,c;
        //Generic Constructor for Handling Different Type Object
        TestMaximum(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        //compareTo method for Checking Maximum from 3 Integer Object
        public T compareTo() {
            if (a.compareTo(b) > 0) {
                if (a.compareTo(c) > 0) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if (b.compareTo(c) > 0) {
                    return b;
                } else {
                    return c;
                }
            }
        }


    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Problem!");
        TestMaximum<Integer> integerComparison = new TestMaximum(19, 12, 20);
        System.out.println("Maximum from 3 Integer: " +integerComparison.compareTo());
        TestMaximum<Float> floatComparison = new TestMaximum(19.0, 12.0, 20.0);
        System.out.println("Maximum from 3 Float : "+floatComparison.compareTo());
        TestMaximum<String> stringComparison = new TestMaximum("Apple", "Peach", "Banana");
        System.out.println("Maximum from 3 String : " +stringComparison.compareTo());
    }
}
