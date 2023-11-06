package com.codegym.number;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        String numberIsEntered="";
        if(number >= 0 && number< 10){
            numberIsEntered=readSingleDigitNumber(number);
        } else if (number >= 10 && number < 20) {
            numberIsEntered=readNumberUpTo19(number);
        } else if (number >= 20 && number < 100 ) {
            int tens = number/10;
            int ones= number%10;
            numberIsEntered=readTens(tens)+" "+readSingleDigitNumber(ones);
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            numberIsEntered=readSingleDigitNumber(hundreds)+"hundred";
            if (remainder>0){
                numberIsEntered += "and"+readNumber(remainder);
            }
        }else {
            numberIsEntered = "out of ability";
        }
        System.out.println(numberIsEntered);
    }
    public static String readSingleDigitNumber(int number){
        String[]words={
                "zero","one","two","three","four","five","six","seven","eight","nine"
        };
        return words[number];
    }
    public static String readNumberUpTo19(int number) {
        String[] words = {
                "ten", "eleven", "twelve", "thirteen", "thirteen", "fourteen", "fifteen", "sixteen", "eighteen", "nineteen"
        };
        return words[number-10];
    }
    public static String readTens(int tens){
        String[] words={
          "","","twenty","thirty","forty" ,"fifty","sixty","seventy","eighty","ninety"
        };
        return words[tens];
    }
    public static String readNumber(int number){
        if(number > 0 && number < 10){
            return readSingleDigitNumber(number);
        } else if (number > 10 && number < 20) {
            return readNumberUpTo19(number);
        }else {
            return "out of ability";
        }
     }
}

