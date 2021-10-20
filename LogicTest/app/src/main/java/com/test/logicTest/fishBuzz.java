package com.test.logicTest;

import java.util.ArrayList;
import java.util.List;

public class fishBuzz {
    public static void main(String[] args) {
        inputFish(15);
    }

    private static void inputFish(int f) {
        List<String> fish = new ArrayList<>();
        for (int i = 1; i <= f; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fish.add("FizzBuzz");
            } else if (i % 5 == 0) {
                fish.add("Buzz");
            } else if (i % 3 == 0) {
                fish.add("Fizz");
            } else {
                fish.add(String.valueOf(i));
            }
        }
        System.out.println(fish);
    }
}
