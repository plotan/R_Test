package com.test.logicTest;

import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        inputWord("I am A great human");
    }

    private static void inputWord(String w) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < w.length(); ++i) {
            if (w.charAt(i) != ' ')
                st.push(w.charAt(i));
            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }

}
