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
public class FibonacciSequence {
    /**
     * Develop a program that has the user enter a number.Your program should
 print out the Fibonacci sequence to that number or the Nth number
     * @param n
     */
    
    public void run(int n){
        System.out.println("Fibonacci Sequence Program is starting on JNumbers");
        System.out.println("Printing Fibonacci sequence");
        int num = this.nth(1);
        int i = 1;
        while(num <= n){
            num = this.nth(i);
            System.out.print(num);
            System.out.print(", ");
            i++;
        }
        System.out.println("");
        System.out.println("Printing Nth number");
        System.out.println(this.nth(n));
        System.out.println("Fibonacci Sequence Program is ending on JNumbers");
    }
    
    //Starts printing from index 1
    public int loops(int n){
        int previous = -1;
        int result = 1;
        for(int i= 0; i <= n; ++i){
            int sum = result + previous;
            previous = result;
            result = sum;
        }
        return result;
    }
    
    public int nth(int n){
        if(n < 2) return n;
        return nth(n - 1) + nth(n - 2);
    }
    
}
