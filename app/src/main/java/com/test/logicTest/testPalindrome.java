package com.test.logicTest;

// Your First Program

class testPalindrome {
    public static void main(String[] args) {

        inputPalindrome("Radar");
        inputPalindrome("Malam");
        inputPalindrome("Kasur ini rusak");
        inputPalindrome("Ibu Ratna antar ubi");
        inputPalindrome("Malas");
        inputPalindrome("Makan nasi goreng");
        inputPalindrome("Balonku ada lima");
    }

    private static void inputPalindrome(String str) {
        if (checkPalindrome(str))
            System.out.printf(str + "     # --> palindrome\n");
        else
            System.out.println(str + "     # --> not palindrome");
    }

    private static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
