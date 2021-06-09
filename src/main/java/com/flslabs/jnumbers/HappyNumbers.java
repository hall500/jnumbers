/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flslabs.jnumbers;

/**
 *
 * @author HALL
 */
public class HappyNumbers {
    /**
     * A happy number is defined by the following process.Starting with any 
 integer, replace the number by the sum of the squares of its digits, and
 repeat the process until the number equals 1 (where it will stay), or it
 loops endlessly in a cycle which does not include 1. Those numbers from 
 which the process ends in 1 are happy numbers, while those that do not 
 end in 1 are unhappy numbers. Find the first 8 happy numbers.
     * @param n
     */
    
    public static void run(int n){
        System.out.println("Happy Numbers Program starting on JNumber");
        System.out.println("Finding E to the Nth Number");
        int totalPrinted = 0;
        for(int i = 1; i < 1000; i++){
            if(totalPrinted > n) break;
            if(!happy(i)) continue;
            System.out.println(i);
            totalPrinted++;
        }
        System.out.println("");
        System.out.println("Happy Numbers Program ending on JNumber");
    }
    
    protected static boolean happy(int number){
        if(number == 1 || number == 7) return true;
        int sum = number, x = number;
        
        while (sum > 9){
            sum = 0;
            while(x > 0){
                int d = x % 10;
                sum += d*d;
                x /= 10;
            }
            if(sum == 1) return true;
            x = sum;
        }
        
        if(sum == 7) return true;
        return false;
    }  
}
