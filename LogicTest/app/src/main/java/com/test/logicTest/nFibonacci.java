package com.test.logicTest;

public class nFibonacci {
    public static void main(String[] args) {
        inputValue(15, 1, 60);
    }

    private static void inputValue(int a, int b, int c) {
        int i = a + b + c;
        if (i == 0) {
            System.out.println(0);
            return;
        }
        int f = 0, s = 1;
        int t = f + s;

        while (t <= i) {
            f = s;
            s = t;
            t = f + s;
        }

        int check;

        if (Math.abs(t - i) >= Math.abs(s - i))
            check = s;
        else
            check = t;

        System.out.println("Nearest: " + check + " \nOutput: " + (check - i));
    }
}
