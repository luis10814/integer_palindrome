package com.company;

public class Main {
    /**
     * This program looks at int and checks if it is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     * I challenged myself to do this without converting the int to a string.
     */
    public static void main(String[] args) {
	    int x = 10;
        int reversed = 0;
        boolean output;
        int temp = x;

        // if x is a negative number it will never be palindrome.
        if(x < 0){
            output = false;
        }
        // This reverses x and stores it in the reversed variable. Temp is so i wont overwrite x
        else {
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
        }

        // Checks if x and reversed are the same. if yes then x is a palindrome
        if(x == reversed){
            output = true;
        }
        else{
            output = false;
        }
        System.out.println(x + " " + reversed);
        System.out.println(output);

    }
}
