package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0; 
        for(int i = 0; i < n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int lastDigit, reverse = 0;
       while(val > 0){
        lastDigit = val % 10;
        reverse = (reverse * 10) + lastDigit;
        val = val / 10; 
       }

        return reverse;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if(val % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}

